package com.skt.doss.portal.front.user.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.skt.doss.portal.front.api_gateway.v1.client.PortalBackendApiClient;
import com.skt.doss.portal.front.api_gateway.v1.domain.CheckDossUser;
import com.skt.doss.portal.front.api_gateway.v1.domain.CheckDossUser.Res;
import com.skt.doss.portal.front.user.constant.Role;
import com.skt.doss.portal.front.user.domain.DossUserDetails;

@Service
public class UserAuthService implements UserDetailsService {
    
  private static final Logger log = LoggerFactory.getLogger(UserAuthService.class);

  @Autowired
  private PortalBackendApiClient portalBackendApiClient;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    DossUserDetails details = new DossUserDetails();
    details.setUserid(username);
    return details;
  }
  
  public UsernamePasswordAuthenticationToken authenticate(Authentication authentication ) {
    
    ResponseEntity<Res> responseEntity = portalBackendApiClient.checkDossUser(
        CheckDossUser.Req.builder()
          .dossId((String)authentication.getPrincipal())
          .pwd((String)authentication.getCredentials())
          .build());
    
    if (responseEntity != null && responseEntity.hasBody()) {
      Res res = responseEntity.getBody();
      log.debug("!@# responseBody: {}", res.toString());
      if ("Y".equals(res.getResult())) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(Role.ADMIN));
        return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), authorities);
      }
    }
    
    return null;
  }
}

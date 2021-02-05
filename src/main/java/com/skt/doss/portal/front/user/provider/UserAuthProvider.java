package com.skt.doss.portal.front.user.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import com.skt.doss.portal.front.user.service.UserAuthService;

@Component
public class UserAuthProvider implements AuthenticationProvider {
  
  @Autowired
  private UserAuthService dossUserAuthService;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    return dossUserAuthService.authenticate(authentication);
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
  }
}

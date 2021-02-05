package com.skt.doss.portal.front.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.skt.doss.portal.front.api_gateway.v1.client.PortalBackendApiClient;
import com.skt.doss.portal.front.api_gateway.v1.domain.MakeDossId;
import com.skt.doss.portal.front.api_gateway.v1.domain.SignUp;

@Service
public class UserService {

  private static final Logger log = LoggerFactory.getLogger(UserService.class);

  @Autowired
  private PortalBackendApiClient portalBackendApiClient;

  public SignUp.Res signUp(SignUp.Req req) {
    
    log.debug("!@# SignUp.Req: {}", req.toString());

    ResponseEntity<SignUp.Res> responseEntity = portalBackendApiClient.signUp(req);

    if (responseEntity != null) {
      log.debug("!@# ResponseEntity<SignUp.Res>: {}", responseEntity.toString());
      if(responseEntity.hasBody()) {
        SignUp.Res res = responseEntity.getBody();
        log.debug("!@# SignUp.Res: {}", res.toString());
        return res;
      }
    }

    return null;
  }

  public MakeDossId.Res makeDossId() {

    ResponseEntity<MakeDossId.Res> responseEntity = portalBackendApiClient.makeDossId();

    if (responseEntity != null) {
      log.debug("!@# ResponseEntity<MakeDossId.Res>: {}", responseEntity.toString());
      if(responseEntity.hasBody()) {
        MakeDossId.Res res = responseEntity.getBody();
        log.debug("!@# MakeDossId.Res: {}", res.toString());
        return res;
      }
    }

    return null;
  }
}

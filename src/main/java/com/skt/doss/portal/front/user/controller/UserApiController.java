package com.skt.doss.portal.front.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.skt.doss.portal.front.api_gateway.v1.domain.MakeDossId;
import com.skt.doss.portal.front.api_gateway.v1.domain.SignUp;
import com.skt.doss.portal.front.user.service.UserService;

@RestController
public class UserApiController {
  
  @Autowired
  private UserService userService;

  @GetMapping("/api/user/makeDossId")
  public ResponseEntity<MakeDossId.Res> makeDossId() throws Exception {
//    String fakeDossId = DateUtil.getCurrentDate();
//    return ResponseEntity.ok(MakeDossId.Res.builder().code("").msg("").nextDossId(fakeDossId).build());
    return ResponseEntity.ok(userService.makeDossId());
  }

  @PostMapping("/api/user/signUp")
  public ResponseEntity<SignUp.Res> signUp(@RequestBody SignUp.Req req) throws Exception {
    return ResponseEntity.ok(userService.signUp(req));
  }
}

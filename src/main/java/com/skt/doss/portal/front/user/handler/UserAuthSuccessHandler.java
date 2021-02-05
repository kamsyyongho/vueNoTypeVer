package com.skt.doss.portal.front.user.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class UserAuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {  
//class UserAuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

  private static final Logger log = LoggerFactory.getLogger(UserAuthSuccessHandler.class);
  
  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
    
    log.debug("!@# onAuthenticationSuccess");
    
    HttpSession session = request.getSession();
    session.setAttribute("principal", authentication.getPrincipal());
    
    getRedirectStrategy().sendRedirect(request, response, "/");
    
  }


}

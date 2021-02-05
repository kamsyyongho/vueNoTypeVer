package com.skt.doss.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.skt.doss.portal.front.user.constant.Role;
import com.skt.doss.portal.front.user.handler.UserAuthFailureHandler;
import com.skt.doss.portal.front.user.handler.UserAuthSuccessHandler;
import com.skt.doss.portal.front.user.provider.UserAuthProvider;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  
  @Autowired
  private UserAuthProvider userAuthProvider;
  
  @Autowired
  private UserAuthSuccessHandler userAuthSuccessHandler;
  
  @Autowired
  private UserAuthFailureHandler userAuthFailureHandler;

  @Bean
  public PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth
      .authenticationProvider(userAuthProvider);
//      .userDetailsService(dossUserDetailsService);
  }
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
    .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
    .antMatchers(
        "/api/**",
        "/ext-js/**", 
        "/login",
        "/join"
        ).permitAll()
    .antMatchers("/").hasAuthority(Role.ADMIN)
    .anyRequest().authenticated().and()
    .formLogin().loginPage("/login").usernameParameter("userid")
    .successHandler(userAuthSuccessHandler)
    .failureHandler(userAuthFailureHandler)
    .and()
    .logout().logoutUrl("/logout").and()
    .csrf().disable();
  }

}

package com.skt.doss.portal.front.api_gateway.v1.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@Builder
@SuppressWarnings("serial")
public class CheckDossUser implements Serializable {
  
  @Getter
  @Setter
  @SuperBuilder
  @ToString
  public static class Req {
    private String dossId;    
    private String pwd;
  }
  
  @Getter
  @Setter
  @SuperBuilder
  @NoArgsConstructor
  @AllArgsConstructor
  @ToString
  public static class Res extends CommonRes {
    
    private String result;
  }
  
  
  
  
  
}

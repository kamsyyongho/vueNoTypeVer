package com.skt.doss.portal.front.api_gateway.v1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.skt.doss.common.config.ApiHeaderConfiguration;
import com.skt.doss.portal.front.api_gateway.v1.domain.CheckDossUser;
import com.skt.doss.portal.front.api_gateway.v1.domain.MakeDossId;
import com.skt.doss.portal.front.api_gateway.v1.domain.SearchCompanyInfo;
import com.skt.doss.portal.front.api_gateway.v1.domain.SearchCompanyList;
import com.skt.doss.portal.front.api_gateway.v1.domain.SignUp;

@FeignClient(name = "admin-svc-api", url = "${feign.doss-portal-api.url}", configuration = {ApiHeaderConfiguration.class})
public interface PortalBackendApiClient {

    @PostMapping(value="/api/v1/user/checkDossUser")
    public ResponseEntity<CheckDossUser.Res> checkDossUser(@RequestBody CheckDossUser.Req req);
    
    @GetMapping(value="/api/v1/comm/searchCompanyList")
    public ResponseEntity<SearchCompanyList.Res> searchCompanyList();
    
    @GetMapping(value="/api/v1/comm/searchCompanyInfo/{companyName}")
    public ResponseEntity<SearchCompanyInfo.Res> searchCompanyInfo(@PathVariable String companyName);
    
    @PostMapping(value="/api/v1/user/signUp")
    public ResponseEntity<SignUp.Res> signUp(@RequestBody SignUp.Req req);
    
    @GetMapping(value="/api/v1/user/makeDossId")
    public ResponseEntity<MakeDossId.Res> makeDossId();
}


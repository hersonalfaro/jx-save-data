package com.hersonalfaro.jx.jxsavedata;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "jx-upper-case-api")
public interface UpperCaseClient {
    

    @RequestMapping(method = RequestMethod.GET, value = "/uppercase")
    String upperCase(@RequestParam(name="value")  String value);
}

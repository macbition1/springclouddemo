package com.chunbiao.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account")
public interface AccountFeign {
    @GetMapping("/account/login/{username}/{password}/{type}")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type);
}

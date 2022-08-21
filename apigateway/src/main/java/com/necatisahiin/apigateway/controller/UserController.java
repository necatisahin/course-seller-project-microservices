package com.necatisahiin.apigateway.controller;

import com.necatisahiin.apigateway.model.Role;
import com.necatisahiin.apigateway.security.UserPrincipal;
import com.necatisahiin.apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author necatisahiin
 * @date 10.10.2021
 * @time 12:55
 */
@RestController
@RequestMapping("api/user") //pre-path
public class UserController
{
    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")//api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role)
    {
        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);
    }
}

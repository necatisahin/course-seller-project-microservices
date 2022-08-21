package com.necatisahiin.apigateway.controller;


import com.necatisahiin.apigateway.request.PurchaseServiceRequest;
import com.necatisahiin.apigateway.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author necatisahiin
 * @date 10.10.2021
 * @time 13:45
 */
@RestController
@RequestMapping("gateway/purchase")//pre-path
public class PurchaseController
{
    @Autowired
    private PurchaseServiceRequest purchaseServiceRequest;


    @PostMapping//gateway/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Object purchase)
    {
        return new ResponseEntity<>(purchaseServiceRequest.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping//gateway/purchase
    public ResponseEntity<?> getAllPurchasesOfAuthorizedUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseServiceRequest.getAllPurchasesOfUser(userPrincipal.getId()));
    }
}

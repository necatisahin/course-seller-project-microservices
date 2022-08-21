package com.necatisahiin.purchase.controller;

import com.necatisahiin.purchase.model.Purchase;
import com.necatisahiin.purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")//api/purchase/{userId}
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId)
    {
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }
}

package com.necatisahiin.purchase.service;

import com.necatisahiin.purchase.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}

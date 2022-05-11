package com.example.redcat.microservice2purchase.service;

import com.example.redcat.microservice2purchase.model.Purchase;

import java.util.List;

public interface IPurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}

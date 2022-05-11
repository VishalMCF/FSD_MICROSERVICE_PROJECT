package com.example.redcat.microservice2purchase.controller;

import com.example.redcat.microservice2purchase.model.Purchase;
import com.example.redcat.microservice2purchase.service.IPurchaseService;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 9.10.2021
 * @time 18:03
 */
@RestController
@RequestMapping("api/purchase")//pre-path
public class PurchaseController
{
    @Autowired
    private IPurchaseService purchaseService;

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

package com.example.redcat.microservice2purchase.repository;

import com.example.redcat.microservice2purchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author sa
 * @date 9.10.2021
 * @time 17:52
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{
    //findBy+fieldName

    List<Purchase> findAllByUserId(Long userId);
}

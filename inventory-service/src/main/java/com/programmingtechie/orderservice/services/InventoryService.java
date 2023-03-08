package com.programmingtechie.orderservice.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.programmingtechie.orderservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(@PathVariable("sku-code") String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

}

package com.example.jumboStoreMap.controller;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import com.example.jumboStoreMap.DB.MockDB;
import com.example.jumboStoreMap.dto.ProductPosition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MapController {

    @GetMapping("product")
    public List<ProductPosition> findProduct(@RequestParam("id") Integer storeId,
                                             @RequestParam("product") String productName) {
        log.info("request " + storeId + " product : " + productName);
        return MockDB.getProductPosition(storeId, productName);
    }


}

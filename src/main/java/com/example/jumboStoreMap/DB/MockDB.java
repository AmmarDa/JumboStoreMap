package com.example.jumboStoreMap.DB;

import com.example.jumboStoreMap.dto.ProductPosition;
import java.util.List;

public class MockDB {

    private static final List<ProductPosition> productPositionList = List.of(new ProductPosition("Milk", 1));

    public static List<ProductPosition> getProductPosition(String productName) {
        return productPositionList.stream()
                .filter(productPosition -> productPosition.getProductName().contains(productName))
                .toList();
    }

}

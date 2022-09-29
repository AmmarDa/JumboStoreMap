package com.example.jumboStoreMap.DB;

import com.example.jumboStoreMap.dto.ProductPosition;
import com.example.jumboStoreMap.dto.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MockDB {


    static List<Store> stores = new ArrayList<>();
    static Store store1 = Store.builder().id(1)
                .productPositionList(
                        List.of( ProductPosition.builder()
                                .productName("milk")
                                .bay(1)
                                .box(1)
                                .build(),
                                ProductPosition.builder()
                                .productName("water")
                                .bay(1)
                                .box(2)
                                .build())).build();

        static {

            stores.add(store1);
        }
        public static List<ProductPosition> getProductPosition(Integer storeId , String productName) {
            Optional<Store> store = stores.stream().filter(s -> Objects.equals(s.getId(), storeId)).findFirst();
            if (store.isEmpty())
                return null;
            return store.get().getProductPositionList().stream()
                    .filter(productPosition -> productPosition.getProductName().contains(productName))
                    .toList();
        }



}

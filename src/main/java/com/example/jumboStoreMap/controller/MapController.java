package com.example.jumboStoreMap.controller;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import com.example.jumboStoreMap.DB.MockDB;
import com.example.jumboStoreMap.dto.ProductPosition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/findProduct", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MapController {

    @GetMapping()
    @Operation(
            summary = "Find product",
            requestBody =
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    content =
                    @Content(
                            schema = @Schema(implementation = ProductPosition.class),
                            examples = {
                                    @ExampleObject(
                                            name = "Request",
                                            summary = "Request",
                                            description = "Find Product")
                            })))
    public List<ProductPosition> findProduct(@RequestParam String storeId, @RequestParam String categoryName) {

        return MockDB.getProductPosition(categoryName);
    }


}

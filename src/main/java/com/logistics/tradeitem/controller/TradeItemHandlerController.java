package com.logistics.tradeitem.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Trade Item Handler API", description = "APIs for handling trade item operations")
@RestController
@RequestMapping("/api/v1/trade-items")
@RequiredArgsConstructor
public class TradeItemHandlerController {




    @PutMapping("/{tradeItemId}")
    public ResponseEntity<Void> createOrUpdateTradeItem() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping
    public ResponseEntity<Void> createOrUpdateTradeItemList() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTradeItem() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

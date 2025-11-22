package com.logistics.tradeitem.controller;

import com.logistics.tradeitem.dto.TradeItemDetailDTO;
import com.logistics.tradeitem.dto.TradeItemSummaryDTO;
import com.logistics.tradeitem.service.TradeItemSearchService;
import com.logistics.tradeitem.service.impl.TradeItemSearchServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/trade-items")
@RequiredArgsConstructor
@Tag(name = "Trade Item API", description = "APIs for trade item")
public class TradeItemSearchController {

    private final TradeItemSearchService tradeItemSearchService;

    @Operation(summary = "Get Trade Item Summary", description = "Retrieve summary information about a specific trade item by its ID.")
    @GetMapping("/{tradeItemId}")
    public ResponseEntity<TradeItemSummaryDTO> selectTradeItemSummary(
            @Schema(description = "Unique identifier for the trade item", example = "1001", requiredMode = Schema.RequiredMode.AUTO)
            @PathVariable Long tradeItemId
    ) {
        return ResponseEntity.ok(null);
    }

    @Operation(summary = "Get Trade Item Detail", description = "Retrieve detailed information about a specific trade item by its ID.")
    @GetMapping("/{tradeItemId}/detail")
    public ResponseEntity<TradeItemDetailDTO> selectTradeItemDetail(
            @Schema(description = "Unique identifier for the trade item", example = "1001", requiredMode = Schema.RequiredMode.REQUIRED)
            @PathVariable Long tradeItemId
    ) {
        return ResponseEntity.ok(null);
    }

}

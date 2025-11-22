package com.logistics.tradeitem.service.impl;

import com.logistics.tradeitem.dto.TradeItemDTO;
import com.logistics.tradeitem.dto.TradeItemDetailDTO;
import com.logistics.tradeitem.dto.TradeItemSummaryDTO;
import com.logistics.tradeitem.service.TradeItemSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TradeItemSearchServiceImpl implements TradeItemSearchService {

    /**
     * Retrieve a TradeItem by its ID.
     * @param tradeItemId the unique identifier of the trade item
     * @return the TradeItemDTO object
     */
    @Override
    public TradeItemDTO selectTradeItemById(Long tradeItemId) {
        return null;
    }

    /**
     * Retrieve a summary of a TradeItem by its ID.
     * @param tradeItemId the unique identifier of the trade item
     * @return the TradeItemSummaryDTO object
     */
    @Override
    public TradeItemSummaryDTO selectTradeItemSummaryById(Long tradeItemId) {
        return null;
    }

    /**
     * Retrieve detailed information of a TradeItem by its ID.
     * @param tradeItemId the unique identifier of the trade item
     * @return the TradeItemDetailDTO object
     */
    @Override
    public TradeItemDetailDTO selectTradeItemDetailById(Long tradeItemId) {
        return null;
    }

}

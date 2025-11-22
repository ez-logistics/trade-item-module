package com.logistics.tradeitem.service;

import com.logistics.tradeitem.dto.TradeItemDTO;
import com.logistics.tradeitem.dto.TradeItemDetailDTO;
import com.logistics.tradeitem.dto.TradeItemSummaryDTO;

public interface TradeItemSearchService {
    TradeItemDTO selectTradeItemById(Long tradeItemId);
    TradeItemSummaryDTO selectTradeItemSummaryById(Long tradeItemId);
    TradeItemDetailDTO selectTradeItemDetailById(Long tradeItemId);
}

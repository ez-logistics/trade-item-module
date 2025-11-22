package com.logistics.tradeitem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Schema(title = "Trade Item Summary Data Transfer Object", description = "DTO representing a summary of trade item information.")
public class TradeItemSummaryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2234567890123456789L;

    @Schema(description = "Unique identifier for the trade item", example = "1001", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long productId;

    @Schema(description = "Name of the trade item", example = "Premium Coffee Beans", requiredMode = Schema.RequiredMode.REQUIRED)
    private String productName;

    @Schema(description = "Identifier for the vendor supplying the trade item", example = "501", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long vendorId;

    @Schema(description = "Name of the vendor supplying the trade item", example = "Coffee Bean", requiredMode = Schema.RequiredMode.REQUIRED)
    private String vendorName;

    @Schema(description = "Identifier for the category of the trade item", example = "C01", requiredMode = Schema.RequiredMode.REQUIRED)
    private String categoryId;

    @Schema(description = "Name of the category of the trade item", example = "Beverages", requiredMode = Schema.RequiredMode.REQUIRED)
    private String categoryName;

    @Schema(description = "List of hashtags associated with the trade item", example = "[\"#organic\", \"#fairtrade\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<String> hashTags;

}

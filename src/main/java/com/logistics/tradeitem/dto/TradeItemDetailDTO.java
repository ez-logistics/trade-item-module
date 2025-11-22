package com.logistics.tradeitem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Schema(title = "Trade Item Detail Data Transfer Object", description = "DTO representing detailed information of a trade item.")
public class TradeItemDetailDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 3234567890123456789L;

    @Schema(description = "Unique identifier for the trade item", example = "1001", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long productId;

    @Schema(description = "Barcode of the trade item", example = "0123456789123", requiredMode = Schema.RequiredMode.REQUIRED)
    private String barcode;

    @Schema(description = "Name of the trade item", example = "Premium Coffee Beans", requiredMode = Schema.RequiredMode.REQUIRED)
    private String productName;




}

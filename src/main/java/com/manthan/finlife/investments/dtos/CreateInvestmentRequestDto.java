package com.manthan.finlife.investments.dtos;

import com.manthan.finlife.investments.interfaces.CreateInvestmentRequest;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateInvestmentRequestDto implements CreateInvestmentRequest {
    @NotNull
    private UUID assetUUID;

    @NotNull
    @Min(0)
    @Max(100000000)
    private Long amount;
}

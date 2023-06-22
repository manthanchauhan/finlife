package com.manthan.finlife.investments.dtos;

import com.manthan.finlife.investments.interfaces.CreateInvestmentResponse;
import com.manthan.finlife.investments.interfaces.Investment;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateInvestmentResponseDto implements CreateInvestmentResponse {
    private UUID assetUUID;
    private Long amount;
    private Long userId;

    @Getter(AccessLevel.NONE)
    private UUID uuid;

    @Override
    public UUID getUUID() {
        return uuid;
    }

    public static CreateInvestmentResponseDto fromInvestment(Investment investment){
        return new CreateInvestmentResponseDto(
                investment.getAssetUUID(),
                investment.getAmount(),
                investment.getUserId(),
                investment.getUUID()
        );
    }
}

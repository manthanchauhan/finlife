package com.manthan.finlife.investments.dtos;

import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.ListInvestmentResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ListInvestmentResponseDto implements ListInvestmentResponse {
    private List<Investment> investments;
    private Long investmentCount;

    public ListInvestmentResponseDto(List<Investment> investments){
        this.investments = investments;
        this.investmentCount = (long) investments.size();
    }
}

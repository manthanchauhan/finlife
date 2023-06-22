package com.manthan.finlife.investments.dtos;

import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.InvestmentListResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class InvestmentListResponseDto implements InvestmentListResponse {
    private List<Investment> investments;
    private Long investmentCount;

    public InvestmentListResponseDto(List<Investment> investments){
        this.investments = investments;
        this.investmentCount = (long) investments.size();
    }
}

package com.manthan.finlife.investments.interfaces;

public interface InvestmentIntermediateService {
    ListInvestmentResponse getInvestments();
    CreateInvestmentResponse createInvestment(CreateInvestmentRequest request);
}

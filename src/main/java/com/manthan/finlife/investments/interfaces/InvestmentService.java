package com.manthan.finlife.investments.interfaces;

import java.util.List;

public interface InvestmentService {
    List<Investment> getAllByUserId(Long userId);
    Investment createInvestment(CreateInvestmentRequest investment, Long userId);
    void deleteInvestment(Long investmentId);
    Investment updateInvestment(Investment investment);
}

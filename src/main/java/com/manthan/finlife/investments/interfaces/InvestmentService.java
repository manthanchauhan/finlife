package com.manthan.finlife.investments.interfaces;

import java.util.List;

public interface InvestmentService {
    List<Investment> getAllByUserId(Long userId);
    Investment createInvestment(Investment investment);
    void deleteInvestment(Long investmentId);
    Investment updateInvestment(Investment investment);
}

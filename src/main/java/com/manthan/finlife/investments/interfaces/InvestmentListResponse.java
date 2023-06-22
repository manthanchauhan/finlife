package com.manthan.finlife.investments.interfaces;

import java.util.List;

public interface InvestmentListResponse {
    List<Investment> getInvestments();
    Long getInvestmentCount();
}

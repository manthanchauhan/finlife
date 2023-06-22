package com.manthan.finlife.investments.interfaces;

import java.util.List;

public interface ListInvestmentResponse {
    List<Investment> getInvestments();
    Long getInvestmentCount();
}

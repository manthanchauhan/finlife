package com.manthan.finlife.investments.interfaces;

import java.util.UUID;

public interface CreateInvestmentResponse extends CreateInvestmentRequest{
    UUID getUUID();
}

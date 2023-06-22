package com.manthan.finlife.investments.interfaces;

import java.util.UUID;

public interface CreateInvestmentRequest {
    UUID getAssetUUID();
    Long getAmount();
}

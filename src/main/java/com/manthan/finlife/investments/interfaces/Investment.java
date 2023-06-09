package com.manthan.finlife.investments.interfaces;

import java.util.UUID;

public interface Investment {
    UUID getAssetUUID();
    Long getAmount();
    Long getUserId();
    UUID getUUID();
}

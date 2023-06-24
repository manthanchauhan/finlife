package com.manthan.finlife.assets.interfaces;

import java.util.List;

public interface AssetListResponse {
    List<Asset> getAssets();
    Long getCount();
}

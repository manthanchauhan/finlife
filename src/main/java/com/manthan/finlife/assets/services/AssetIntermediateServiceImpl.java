package com.manthan.finlife.assets.services;

import com.manthan.finlife.assets.dtos.AssetListResponseDto;
import com.manthan.finlife.assets.interfaces.Asset;
import com.manthan.finlife.assets.interfaces.AssetIntermediateService;
import com.manthan.finlife.assets.interfaces.AssetListResponse;
import com.manthan.finlife.assets.interfaces.AssetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AssetIntermediateServiceImpl implements AssetIntermediateService {
    private AssetService assetService;

    @Override
    public AssetListResponse getAssets() {
        List<Asset> assets = assetService.getAssets();
        return new AssetListResponseDto(assets);
    }
}

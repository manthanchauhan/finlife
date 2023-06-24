package com.manthan.finlife.assets.services;

import com.manthan.finlife.assets.interfaces.Asset;
import com.manthan.finlife.assets.interfaces.AssetService;
import com.manthan.finlife.assets.repositories.AssetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AssetServiceImpl implements AssetService {
    public AssetRepository assetRepository;

    @Override
    public List<Asset> getAssets() {
        return new ArrayList<>(
                assetRepository.findAll(AssetRepository.isActive())
        );
    }
}

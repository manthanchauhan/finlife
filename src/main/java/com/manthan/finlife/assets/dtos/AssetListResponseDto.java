package com.manthan.finlife.assets.dtos;

import com.manthan.finlife.assets.interfaces.Asset;
import com.manthan.finlife.assets.interfaces.AssetListResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AssetListResponseDto implements AssetListResponse {
    private List<Asset> assets;
    private Long count;

    public AssetListResponseDto(List<Asset> assets){
        this.assets = assets;
        this.count = (long) assets.size();
    }
}

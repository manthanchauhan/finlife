package com.manthan.finlife.assets;

import com.manthan.finlife.assets.interfaces.AssetIntermediateService;
import com.manthan.finlife.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/assets")
@AllArgsConstructor
public class AssetController {
    private AssetIntermediateService assetIntermediateService;

    @GetMapping("")
    public Response getAssets(){
        return Response.SuccessWithData(assetIntermediateService.getAssets());
    }
}

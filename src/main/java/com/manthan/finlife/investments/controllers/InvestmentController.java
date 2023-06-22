package com.manthan.finlife.investments.controllers;

import com.manthan.finlife.investments.dtos.CreateInvestmentRequestDto;
import com.manthan.finlife.investments.interfaces.InvestmentIntermediateService;
import com.manthan.finlife.response.Response;
import com.manthan.finlife.response.ResponseManager;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/investments")
@AllArgsConstructor
public class InvestmentController {
    private final InvestmentIntermediateService investmentIntermediateService;

    @GetMapping("")
    public Response getInvestments(){
        return ResponseManager.buildSuccessResponse(
                investmentIntermediateService.getInvestments()
        );
    }

    @PostMapping("")
    public Response createInvestment(@RequestBody @Valid CreateInvestmentRequestDto requestDto){
        return Response.SuccessWithData(
                investmentIntermediateService.createInvestment(requestDto)
        );
    }
}

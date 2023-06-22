package com.manthan.finlife.investments.services;

import com.manthan.finlife.investments.dtos.CreateInvestmentResponseDto;
import com.manthan.finlife.investments.dtos.ListInvestmentResponseDto;
import com.manthan.finlife.investments.interfaces.CreateInvestmentRequest;
import com.manthan.finlife.investments.interfaces.CreateInvestmentResponse;
import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.InvestmentIntermediateService;
import com.manthan.finlife.investments.interfaces.ListInvestmentResponse;
import com.manthan.finlife.investments.interfaces.InvestmentService;
import com.manthan.finlife.user.interfaces.User;
import com.manthan.finlife.user.interfaces.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvestmentIntermediateServiceImpl implements InvestmentIntermediateService {
    private final InvestmentService investmentService;
    private final UserService userService;

    @Override
    public ListInvestmentResponse getInvestments() {
        User user = userService.getCurrentUser();
        List<Investment> investments = investmentService.getAllByUserId(user.getId());

        return new ListInvestmentResponseDto(investments);
    }

    @Override
    public CreateInvestmentResponse createInvestment(CreateInvestmentRequest request) {
        User user = userService.getCurrentUser();

        Investment investment = investmentService.createInvestment(request, user.getId());
        return CreateInvestmentResponseDto.fromInvestment(investment);
    }
}

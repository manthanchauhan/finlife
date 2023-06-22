package com.manthan.finlife.investments.services;

import com.manthan.finlife.investments.dtos.InvestmentListResponseDto;
import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.InvestmentIntermediateService;
import com.manthan.finlife.investments.interfaces.InvestmentListRequest;
import com.manthan.finlife.investments.interfaces.InvestmentListResponse;
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
    public InvestmentListResponse getInvestments() {
        User user = userService.getCurrentUser();
        List<Investment> investments = investmentService.getAllByUserId(user.getId());

        return new InvestmentListResponseDto(investments);
    }
}

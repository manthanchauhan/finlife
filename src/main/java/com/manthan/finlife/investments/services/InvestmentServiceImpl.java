package com.manthan.finlife.investments.services;

import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.InvestmentService;
import com.manthan.finlife.investments.repositories.InvestmentImplRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class InvestmentServiceImpl implements InvestmentService {
    private final InvestmentImplRepository investmentRepository;

    @Override
    public List<Investment> getAllByUserId(Long userId) {
        return new ArrayList<>(
                investmentRepository.findAll(InvestmentImplRepository.hasUserId(userId))
        );
    }

    @Override
    public Investment createInvestment(Investment investment) {
        return null;
    }

    @Override
    public void deleteInvestment(Long investmentId) {

    }

    @Override
    public Investment updateInvestment(Investment investment) {
        return null;
    }
}

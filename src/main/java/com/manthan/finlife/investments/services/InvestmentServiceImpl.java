package com.manthan.finlife.investments.services;

import com.manthan.finlife.investments.domains.InvestmentImpl;
import com.manthan.finlife.investments.interfaces.CreateInvestmentRequest;
import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.investments.interfaces.InvestmentService;
import com.manthan.finlife.investments.repositories.InvestmentImplRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public Investment createInvestment(CreateInvestmentRequest request, Long userId) {
        Optional<InvestmentImpl> investment = investmentRepository.findOne(
                InvestmentImplRepository.hasUserId(userId)
                        .and(InvestmentImplRepository.hasAssetUUID(request.getAssetUUID()))
        );

        if (investment.isPresent()){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    String.format("Investment with user %s and asset %s already exists", userId, request.getAssetUUID())
            );
        }

        InvestmentImpl investment1 = new InvestmentImpl(
                request.getAssetUUID(),
                request.getAmount(),
                userId,
                UUID.randomUUID()
        );

        investmentRepository.save(investment1);
        return investment1;
    }

    @Override
    public void deleteInvestment(Long investmentId) {

    }

    @Override
    public Investment updateInvestment(Investment investment) {
        return null;
    }
}

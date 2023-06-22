package com.manthan.finlife.investments.repositories;

import com.manthan.finlife.investments.domains.InvestmentImpl;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvestmentImplRepository extends JpaRepository<InvestmentImpl, Long>, JpaSpecificationExecutor<InvestmentImpl> {
    static Specification<InvestmentImpl> hasUserId(Long userId){
        return (root, cq, cb) -> cb.equal(root.get("userId"), userId);
    }

}

package com.manthan.finlife.investments.repositories;

import com.manthan.finlife.investments.domains.InvestmentImpl;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface InvestmentImplRepository extends JpaRepository<InvestmentImpl, Long>, JpaSpecificationExecutor<InvestmentImpl> {
    static Specification<InvestmentImpl> hasUserId(Long userId){
        return (root, cq, cb) -> cb.equal(root.get("userId"), userId);
    }

    static Specification<InvestmentImpl> hasAssetUUID(UUID assetUUID){
        return (root, cq, cb) -> cb.equal(root.get("assetUUID"), assetUUID);
    }

}

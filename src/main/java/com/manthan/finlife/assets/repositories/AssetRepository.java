package com.manthan.finlife.assets.repositories;

import com.manthan.finlife.assets.domains.AssetImpl;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AssetRepository extends JpaRepository<AssetImpl, Long>, JpaSpecificationExecutor<AssetImpl> {
    static Specification<AssetImpl> isActive() {
        return (root, cq, cb) -> cb.equal(root.get("active"), Boolean.TRUE);
    }
}

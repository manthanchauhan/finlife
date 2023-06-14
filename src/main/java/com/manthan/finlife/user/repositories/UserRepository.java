package com.manthan.finlife.user.repositories;

import com.manthan.finlife.user.domains.UserImpl;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<UserImpl, Long>, JpaSpecificationExecutor<UserImpl> {
    static Specification<UserImpl> hasEmail(String email){
        return (user, cq, cb) -> cb.equal(user.get("email"), email);
    }
}

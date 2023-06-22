package com.manthan.finlife.investments.domains;

import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.utils.AbstractBaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "investment")
@Getter
public class InvestmentImpl extends AbstractBaseModel implements Investment{
    @Column(name = "asset_id")
    private Long assetId;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "user_id")
    private Long userId;
}

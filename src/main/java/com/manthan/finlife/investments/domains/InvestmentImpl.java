package com.manthan.finlife.investments.domains;

import com.manthan.finlife.investments.interfaces.Investment;
import com.manthan.finlife.utils.AbstractBaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "investment")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentImpl extends AbstractBaseModel implements Investment{
    @Column(name = "asset_uuid")
    private UUID assetUUID;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "user_id")
    private Long userId;

    @Getter(AccessLevel.NONE)
    @Column(name = "uuid")
    private UUID uuid;

    @Override
    public UUID getUUID() {
        return this.uuid;
    }
}

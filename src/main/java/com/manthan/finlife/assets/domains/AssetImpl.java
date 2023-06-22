package com.manthan.finlife.assets.domains;

import com.manthan.finlife.assets.interfaces.Asset;
import com.manthan.finlife.utils.AbstractBaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "asset")
@Getter
public class AssetImpl extends AbstractBaseModel implements Asset {
    @Column(name = "name")
    public String name;

    @Getter(AccessLevel.NONE)
    @Column(name = "uuid")
    public UUID uuid;

    @Override
    public String getUUID() {
        return this.uuid.toString();
    }
}

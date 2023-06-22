package com.manthan.finlife.assets.domains;

import com.manthan.finlife.assets.interfaces.Asset;
import com.manthan.finlife.utils.AbstractBaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "asset")
@Getter
public class AssetImpl extends AbstractBaseModel implements Asset {
    @Column(name = "name")
    public String name;
}

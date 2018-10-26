package com.ecommorce.ecommerce.models;

import com.ecommorce.ecommerce.models.seedwork.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
@Table(name = "T_PRODUCT")
public class Product extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private String price;

    @RestResource
    @ManyToOne
    @JoinColumn(name = "favorite_id")
    private Favorite favorite;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonIgnore
    public Favorite getFavorite() {
        return favorite;
    }
    public void setFavorite(Favorite favorite) {
        this.favorite = favorite;
    }

}

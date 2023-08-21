package org.ondcreg.search.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="PRODUCTS")
@JsonPropertyOrder({"prodName"})
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="product_id")
    @JsonIgnore
    private Integer prodId;

    @Column(name="product_name")
    @JsonProperty("name")
    private String prodName;

    @Override
    public boolean equals(Object o) {
        boolean ret = false;
        if(this == o)
            ret = true;
        if(o instanceof Product && prodId != null) {
            if(prodId.equals(((Product) o).getProdId()))
                ret = true;
        }
        return ret;
    }

    @Override
    public int hashCode(){
        return this.getClass().hashCode();
    }
}

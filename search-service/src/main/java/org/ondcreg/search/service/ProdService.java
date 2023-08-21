package org.ondcreg.search.service;

import org.ondcreg.search.persistence.entity.Product;

import java.util.Optional;

public interface ProdService {

    public Optional<Product> getProduct(Integer id);

}

package org.ondcreg.search.service;

import org.ondcreg.search.persistence.ProductRepository;
import org.ondcreg.search.persistence.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ProdServiceImpl implements ProdService {
    @Autowired
    ProductRepository prodRepo;

    @Override
    public Optional<Product> getProduct(Integer id) {
        return prodRepo.findById(id);
    }
}

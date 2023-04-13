package co.id.bca.spring.NanoProduct.service;

import co.id.bca.spring.NanoProduct.model.Product;
import co.id.bca.spring.NanoProduct.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceJPA implements IProductService {

    @Autowired
    IProductRepo repository;

    @Override
    public Product insert(Product product) {
        return repository.save(product);
    }

    @Override
    public Product update(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public Product findProduct(Product product) {
        return repository.findProductById(product.getId());
    }

    @Override
    public List<Product> allProducts() {
        return repository.findAllByOrderByProductName();
    }
}

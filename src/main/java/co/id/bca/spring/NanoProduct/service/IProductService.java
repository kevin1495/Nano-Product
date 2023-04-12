package co.id.bca.spring.NanoProduct.service;

import co.id.bca.spring.NanoProduct.model.Product;

import java.util.List;

public interface IProductService {

    void insert(Product product);
    void update(Product product);
    void delete(Product product);
    Product findProduct(Product product);
    List<Product> allProducts();
}

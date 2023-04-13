package co.id.bca.spring.NanoProduct.service;

import co.id.bca.spring.NanoProduct.model.Product;

import java.util.List;

public interface IProductService {

    Product insert(Product product);
    Product update(Product product);
    void delete(Product product);
    Product findProduct(Product product);
    List<Product> allProducts();
}

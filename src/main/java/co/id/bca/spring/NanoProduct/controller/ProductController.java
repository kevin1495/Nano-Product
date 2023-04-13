package co.id.bca.spring.NanoProduct.controller;

import co.id.bca.spring.NanoProduct.model.Product;
import co.id.bca.spring.NanoProduct.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public List<Product> findAllProduct() {
        return iProductService.allProducts();
    }

    @GetMapping("{id}")
    public Product findProductById(@PathVariable Integer productId) {
        Product request = new Product();
        request.setId(productId);
        return iProductService.findProduct(request);
    }

    @PostMapping("{id}")
    public Product createProduct(@RequestBody Product product) {
        return iProductService.insert(product);
    }

    @PutMapping("{id}")
    public Product updateProductById(@PathVariable Integer productId, @RequestBody Product product) {
        product.setId(productId);
        return  iProductService.update(product);
    }

    @DeleteMapping("{id}")
    public void deleteProductByID(@PathVariable Integer productId) {
        Product request = new Product();
        request.setId(productId);
        iProductService.delete(request);
    }
}

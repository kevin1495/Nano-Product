package id.co.bca.spring.NanoHolidayProduct.controller;

import id.co.bca.spring.NanoHolidayProduct.model.HolidayProduct;
import id.co.bca.spring.NanoHolidayProduct.service.IHolidayProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/holiday/product")
public class HolidayProductController {

    @Autowired
    IHolidayProductService iProductService;

    @GetMapping("")
    public List<HolidayProduct> findAllProduct() {
        return iProductService.allProducts();
    }

    @GetMapping("{id}")
    public HolidayProduct findProductById(@PathVariable("id") Integer productId) {
        HolidayProduct request = new HolidayProduct();
        request.setId(productId);
        return iProductService.findProduct(request);
    }

    @PostMapping("")
    public HolidayProduct createProduct(@RequestBody HolidayProduct product) {
        return iProductService.insert(product);
    }

    @PutMapping("{id}")
    public HolidayProduct updateProductById(@PathVariable("id") Integer productId, @RequestBody HolidayProduct product) {
        product.setId(productId);
        return  iProductService.update(product);
    }

    @DeleteMapping("{id}")
    public void deleteProductByID(@PathVariable("id") Integer productId) {
        HolidayProduct request = new HolidayProduct();
        request.setId(productId);
        iProductService.delete(request);
    }
}

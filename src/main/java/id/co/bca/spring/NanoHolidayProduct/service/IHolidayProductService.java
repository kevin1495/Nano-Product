package id.co.bca.spring.NanoHolidayProduct.service;

import id.co.bca.spring.NanoHolidayProduct.model.HolidayProduct;

import java.util.List;

public interface IHolidayProductService {

    HolidayProduct insert(HolidayProduct product);
    HolidayProduct update(HolidayProduct product);
    void delete(HolidayProduct product);
    HolidayProduct findProduct(HolidayProduct product);
    List<HolidayProduct> allProducts();
}

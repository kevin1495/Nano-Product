package co.id.bca.spring.NanoHolidayProduct.service;

import co.id.bca.spring.NanoHolidayProduct.model.HolidayProduct;

import java.util.List;

public interface IHolidayProductService {

    HolidayProduct insert(HolidayProduct product);
    HolidayProduct update(HolidayProduct product);
    void delete(HolidayProduct product);
    HolidayProduct findProduct(HolidayProduct product);
    List<HolidayProduct> allProducts();
}

package id.co.bca.spring.NanoHolidayProduct.service;

import id.co.bca.spring.NanoHolidayProduct.model.HolidayProduct;
import id.co.bca.spring.NanoHolidayProduct.repository.IHolidayProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayProductServiceJPA implements IHolidayProductService {

    @Autowired
    IHolidayProductRepo repository;

    @Override
    public HolidayProduct insert(HolidayProduct product) {
        return repository.save(product);
    }

    @Override
    public HolidayProduct update(HolidayProduct product) {
        return repository.save(product);
    }

    @Override
    public void delete(HolidayProduct product) {
        repository.delete(product);
    }

    @Override
    public HolidayProduct findProduct(HolidayProduct product) {
        return repository.findHolidayProductById(product.getId());
    }

    @Override
    public List<HolidayProduct> allProducts() {
        return repository.findAllByOrderByProductName();
    }
}

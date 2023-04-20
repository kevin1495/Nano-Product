package co.id.bca.spring.NanoHolidayProduct.repository;

import co.id.bca.spring.NanoHolidayProduct.model.HolidayProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHolidayProductRepo extends JpaRepository<HolidayProduct,Integer> {

    HolidayProduct findHolidayProductById(Integer id);
    List<HolidayProduct> findAllByOrderByProductName();
    Integer removeById(Integer id);
}

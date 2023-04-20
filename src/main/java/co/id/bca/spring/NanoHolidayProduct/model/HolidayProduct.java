package co.id.bca.spring.NanoHolidayProduct.model;

import jakarta.persistence.*;

@Entity
@Table(name="holiday_product")
public class HolidayProduct {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;
    @Column(name = "product_name")
    String productName;
    @Column(name = "product_price")
    String productPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}

package co.id.bca.spring.NanoProduct.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

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

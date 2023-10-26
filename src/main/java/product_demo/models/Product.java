package product_demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "product_type_id", insertable = false, updatable = false)
    private Long productTypeId;

    @Column(name = "price")
    private Double price;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "product_img")
    private String productImg;

    @Column(name ="product_code")
    private String productCode;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "minimum")
    private Long minimum;

    public   Product() {

    }

    public Product(Long productId, String name, Long quantity, Long productTypeId, Double price, Double cost, String productImg, String productCode, Boolean isDeleted, Long minimum) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.productTypeId = productTypeId;
        this.price = price;
        this.cost = cost;
        this.productImg = productImg;
        this.productCode = productCode;
        this.isDeleted = isDeleted;
        this.minimum = minimum;
    }

    // Getter and Setter methods for each field

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getMinimum() {
        return minimum;
    }

    public void setMinimum(Long minimum) {
        this.minimum = minimum;
    }
}

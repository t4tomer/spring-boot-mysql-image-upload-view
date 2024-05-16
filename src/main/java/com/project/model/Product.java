package com.project.model;

import javax.persistence.*;
import java.util.Date;
import java.sql.Blob;
import com.project.model.Image;

@Entity
@Table(name = "Product_Table")
public class Product {
    @Id
    private String productCode;// primary key of the product db
    private String productName;
    private String productPrice;// The price on one product
    private String productQuantity; // The quantity of the product
    private Date productDate;// The date the product was uploaded to the website
    // @OneToOne
    // // @JoinColumn(name = "image_id")
    // private Image productImage;// Image of the product

    @Lob
    private Blob productImage;

    // public com.project.model.Image productImage;

    private String productCategory;// The category of the product

    public Product() {
        System.out.println("new Product Object created ");
    }

    public Product(
            String productCode,
            String productName,
            String productPrice,
            String productQuantity,
            String productCategory,
            Date productDate,
            Blob productImage) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
        this.productDate = productDate;
        this.productImage = productImage;

        System.out.println("New Product Object created with values ");
    }

    // Getters and setters for productCode
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    // Getters and setters for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getters and setters for productPrice
    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    // Getters and setters for productQuantity
    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    // Getters and setters for productDate
    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    // Getters and setters for productImage
    public Blob getProductImage() {
        return productImage;
    }

    public void setProductImage(Blob productImage) {
        this.productImage = productImage;
    }

    // Getters and setters for productCategory
    public String getproductCategory() {
        return productCategory;
    }

    public void setproductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productCategory='" + productCategory + '\'' +
                ", addted to site at:=" + productDate +
                '}';
    }

}

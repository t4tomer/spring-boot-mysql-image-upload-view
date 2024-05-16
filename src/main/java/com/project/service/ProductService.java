package com.project.service;

import com.project.model.Image;
import com.project.model.Product;
import com.project.repository.ImageRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    // public void addNewProduct(Product newProduct);

    public Product addNewProduct1(Product newProduct);

    List<Product> viewAllProduct();

    List<Image> viewAllImageCategory();

    public void PrintAllProductNames();

    public List<Image> getAllProductImages();

    // public List<Product> findProductsByCategory(String category);
    // @Override
    // public Image create(Image image) {
    // return imageRepository.save(image);
    // }

}

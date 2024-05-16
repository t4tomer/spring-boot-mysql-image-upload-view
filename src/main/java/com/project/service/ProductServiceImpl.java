package com.project.service;

import com.project.model.Image;
import com.project.model.Product;
import com.project.repository.ImageRepository;
import com.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo; // ---> Inject your ProductRepository
    public int NumProd = 1;

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<Image> viewAllImageCategory() {
        @SuppressWarnings("unchecked")
        List<Image> images = (List<Image>) ((Product) productRepo.findAll()).getProductImage();
        return images;
    }

    // @Override
    // public void addNewProduct(Product newProduct) {
    // productRepo.saveAll(Arrays.asList(newProduct));
    // }

    @Override
    public void PrintAllProductNames() {
        List<Product> products = (List<Product>) productRepo.findAll();
        NumProd = 1;
        for (Product product : products) {
            System.out.println("prdouct number:" + NumProd + " is called:" + product.getProductName());
            NumProd++;
        }
    }

    public List<Image> getAllProductImages() {
        List<Product> productsList = (List<Product>) productRepo.findAll();
        NumProd = 1;
        for (Product product : productsList) {
            Image image = (Image) product.getProductImage();
            imageRepository.save(image);
            // imageList.add(product.getProductImage());
            // System.out.println("prdouct number:" + NumProd + " is called:" +
            // product.getProductName());
            // NumProd++;
        }
        List<Image> imageList = (List<Image>) imageRepository.findAll();
        return imageList;
    }

    @Override
    public Product addNewProduct1(Product newProduct) {
        return productRepo.save(newProduct);
    }

    @Override
    public List<Product> viewAllProduct() {
        return (List<Product>) productRepo.findAll();
    }

    // public List<Product> findProductsByCategory(String category) {
    // return productRepo.findByProductCategory(category);
    // }

    // @Override
    // public List<Image> viewAll() {
    // return (List<Image>) productRepo.findAll();
    // }

    // @Override
    // public Image viewById(long id) {
    // return productRepo.findById(id).get();
    // }
}

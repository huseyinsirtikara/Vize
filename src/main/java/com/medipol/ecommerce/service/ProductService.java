package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public ProductService() {

        products.add(new Product(1, "nike air", 200));
        products.add(new Product(2, "addidas", 300));
    }

    public void add(String name, Integer quantity){
        //TODO
        Product product1 = new Product(3,name,quantity);
        products.add(product1);
    }

    public void delete(Integer id) {
        //TODO
        for (Product silinecek:products){
            if (silinecek.getId() == id) {
                products.remove(silinecek);
                break;
            }
        }
    }

    public void update(Integer id, String name, Integer price){
        //TODO
        delete(id);
        Product product1 = new Product(id,name,price);
        products.add(product1);
    }

    public List<Product> list(){
        return products;
    }

    public Product findBy(int productId) {
        //TODO
        for (Product arananurun:products){
            if (arananurun.getId() == productId)
                return arananurun;
        }
        return null;
    }
}

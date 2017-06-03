package com.medipol.ecommerce.service;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceTest {

    @Autowired ProductService productService;
    @Test
    public void shouldListInitialProducts() throws Exception {
        //TODO
        productService = new ProductService();
        assertTrue(productService!=null);
    }

    @Test
    public void shouldAddOneProduct() throws Exception {
        //TODO
        productService = new ProductService();
        productService.add("Ketçap",1);
        assertTrue(productService.findBy(3) != null);
        assertTrue(productService!=null);

    }

    @Test
    public void shouldMultipleOneProduct() throws Exception {
        //TODO
        productService = new ProductService();
        shouldAddOneProduct();
        productService.add("Mayonez",1);

        assertTrue(productService.findBy(3).getName().equals("Ketçap"));
        assertTrue(productService!=null);

    }


    @Test
    public void shouldDeleteProductById() throws Exception {
        //TODO
        productService = new ProductService();
        productService.add("Mayonez",1);
        productService.delete(3);
        assertTrue(productService.findBy(3) == null);
        assertTrue(productService!=null);

    }

    @Test
    public void shouldUpdateProductName() throws Exception {
        //TODO
        productService = new ProductService();
        productService.add("Mayonez",1);
        productService.update(3,"Ketçap",21);
        assertTrue(productService.findBy(3).getName().equals("Ketçap"));
        assertTrue(productService!=null);

    }

    @Test
    public void shouldUpdateProductPrice() throws Exception {
        //TODO
        productService = new ProductService();
        productService.add("Mayonez",1);
        productService.update(3,"Mayonez",44);
        assertTrue(productService.findBy(3).getPrice().equals(44));
        assertTrue(productService!=null);
    }

    @Test
    public void shouldUpdateProductNameAndPrice() throws Exception {
        //TODO
        productService = new ProductService();
        productService.add("Mayonez",1);
        productService.update(3,"Mayonez",1);
        assertTrue(productService.findBy(3).getPrice().equals(1));
        assertTrue(productService.findBy(3).getName().equals("Mayonez"));

        assertTrue(productService!=null);
    }

}
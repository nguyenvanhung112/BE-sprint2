package com.example.be.controller;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.dto.ProductDisPlayDto;
import com.example.be.model.product.*;
import com.example.be.service.product.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/products")
public class ProductRestController {
    @Autowired
    private IProductDetailService productDetailService;
    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IColorService colorService;
    @Autowired
    private IStorageCapacityService storageCapacityService;


    @GetMapping("category")
    public ResponseEntity<List<Category>> getListCategory() {
        List<Category> categoryList = categoryService.getListCategory();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("color")
    public ResponseEntity<List<Color>> getClorList() {
        List<Color> colorList = colorService.getClorList();
        if (colorList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(colorList, HttpStatus.OK);
    }

    @GetMapping("storages")
    public ResponseEntity<List<StorageCapacity>> getStorageList() {
        List<StorageCapacity> storageCapacityList = storageCapacityService.getStorageList();
        if (storageCapacityList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(storageCapacityList, HttpStatus.OK);
    }

    @GetMapping("/product-display-home")
    public ResponseEntity<List<IProductDtoDisplay>> getProductDetail() {
        List<IProductDtoDisplay> productDtoDisplayList = productDetailService.getListProductDisplayHome();
        if (productDtoDisplayList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productDtoDisplayList, HttpStatus.OK);
    }

    @GetMapping("/product-detail/{productId}")
    public ResponseEntity<List<ProductDetail>> getListProductDetailByProductId(@PathVariable Integer productId) {
        List<ProductDetail> productDetails = productDetailService.getListProductDetailByProductId(productId);
        if (productDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productDetails, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("storages/{id}")
    public ResponseEntity<List<StorageCapacity>> getStorageListStorageByProductId(@PathVariable Integer id) {
        List<StorageCapacity> storageCapacityList = storageCapacityService.getStorageListByProductId(id);
        if (storageCapacityList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(storageCapacityList, HttpStatus.OK);
    }

    @GetMapping("color/{id}")
    public ResponseEntity<List<Color>> getColorListByProductId(@PathVariable Integer id) {
        List<Color> colorList = colorService.getColorListByProductId(id);
        if (colorList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(colorList, HttpStatus.OK);
    }
}

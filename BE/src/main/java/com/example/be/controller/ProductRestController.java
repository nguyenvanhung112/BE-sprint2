package com.example.be.controller;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.dto.ProductDisPlayDto;
import com.example.be.model.product.*;
import com.example.be.payload.request.FormSearch;
import com.example.be.service.product.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping("/product-detail/category/{category}")
    public ResponseEntity<List<IProductDtoDisplay>> getListProductDetailByProductId(@PathVariable String category) {
        List<IProductDtoDisplay> productDetails = productDetailService.getListProductDetailByCategory(category);
        if (productDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productDetails, HttpStatus.OK);
    }
//    @GetMapping("/product-detail/search/{nameProduct}")
//    public ResponseEntity<List<IProductDtoDisplay>> searchProduct(@PathVariable String nameProduct) {
//        List<IProductDtoDisplay> productDetails = productDetailService.searchProductByName(nameProduct);
//        if (productDetails.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(productDetails, HttpStatus.OK);
//    }

    @PostMapping("/search")
    public ResponseEntity<Page<IProductDtoDisplay>> searchProductByCategoryAndPriceAndName(@RequestBody FormSearch formSearch, @PageableDefault(value = 6) Pageable pageable) {
        Page<IProductDtoDisplay> productDetails = productDetailService.searchProductByCategoryAndPriceAndName(formSearch,pageable);
        if (productDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
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

    @GetMapping("color-Productdetails")
    public ResponseEntity<List<Color>> getColorListByProductId(@RequestParam(value = "id") Integer id, @RequestParam(value = "storage") String storage) {
        List<Color> colorList = colorService.getColorListByProductId(id, storage);
        if (colorList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(colorList, HttpStatus.OK);
    }

    @GetMapping("productDetail-find")
    public ResponseEntity<ProductDetail> getProductDetail(@RequestParam(value = "id") Integer id, @RequestParam(value = "storage") String storage, @RequestParam(value = "color") String color) {
        ProductDetail productDetail = productDetailService.getProductDetail(id, storage, color);
        if (productDetail == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productDetail, HttpStatus.OK);
    }
}

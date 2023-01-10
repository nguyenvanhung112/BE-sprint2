package com.example.be.controller;

import com.example.be.model.product.ImgUrlProduct;
import com.example.be.service.product.IImgUrlProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/imgs")
public class ImgUrlProductRestController {

    @Autowired
    private IImgUrlProductService imgUrlProductService;

    @GetMapping("/{id}")
    public ResponseEntity<List<ImgUrlProduct>> getListImgProduct(@PathVariable Integer id) {
        List<ImgUrlProduct> imgUrlProductList = imgUrlProductService.getListImgProduct(id);
        if (imgUrlProductList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(imgUrlProductList, HttpStatus.OK);
    }
}

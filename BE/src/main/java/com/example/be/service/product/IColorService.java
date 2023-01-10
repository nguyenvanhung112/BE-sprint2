package com.example.be.service.product;

import com.example.be.model.product.Color;

import java.util.List;

public interface IColorService {
    List<Color> getClorList();

    List<Color> getColorListByProductId(Integer id);
}

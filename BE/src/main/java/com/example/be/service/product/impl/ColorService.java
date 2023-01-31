package com.example.be.service.product.impl;

import com.example.be.model.product.Color;
import com.example.be.repository.product.IColorRepository;
import com.example.be.service.product.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService implements IColorService {
    @Autowired
    private IColorRepository colorRepository;

    @Override
    public List<Color> getClorList() {
        return colorRepository.findAll();
    }

    @Override
    public List<Color> getColorListByProductId(Integer id,String storage) {
        return colorRepository.getColorListByProductId(id,storage);
    }
}

package com.itauge.springbootlayui.controller;

import com.itauge.springbootlayui.mapper.ProductMapper;
import com.itauge.springbootlayui.service.ProductService;
import com.itauge.springbootlayui.vo.BarVO;
import com.itauge.springbootlayui.vo.DataVO;
import com.itauge.springbootlayui.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page, Integer limit){
        return productService.findData(page, limit);
    }

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return productService.getBarVO();
    }

//    @RequestMapping("/pieVO")
//    @ResponseBody
//    public List<PieVO> getPieVO(){
//        return productService.getPieVO();
//    }

    @RequestMapping("/pieVO")
    @ResponseBody
    public List<ProductBarVO> getPieVO(){
        return productMapper.findAllProductBarVO();
    }

}

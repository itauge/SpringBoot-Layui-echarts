package com.itauge.springbootlayui.service;

import com.itauge.springbootlayui.vo.BarVO;
import com.itauge.springbootlayui.vo.DataVO;
import com.itauge.springbootlayui.vo.PieVO;
import com.itauge.springbootlayui.vo.ProductVO;


import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page, Integer limit);
    public BarVO getBarVO();
    public List<PieVO> getPieVO();
}

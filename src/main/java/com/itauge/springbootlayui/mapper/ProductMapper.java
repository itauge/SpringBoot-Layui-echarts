package com.itauge.springbootlayui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itauge.springbootlayui.entity.Product;
import com.itauge.springbootlayui.vo.ProductBarVO;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper extends BaseMapper<Product> {
    @Select("select p.name,sum(quantity) count from order_detail od,product p where od.product_id = p.id group by product_id")
    public List<ProductBarVO> findAllProductBarVO();
}

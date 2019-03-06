package com.leigq.commodity.controller;

import com.leigq.commodity.domain.entity.Commodity;
import com.leigq.commodity.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  商品
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 15:39 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
public class CommodityController {

    @Autowired
    private CommodityService commodityService;


    @GetMapping("/commodities")
    public List<Commodity> listCommodities() {
        return null;
    }

}

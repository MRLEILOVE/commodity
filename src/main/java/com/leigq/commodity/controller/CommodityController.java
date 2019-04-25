package com.leigq.commodity.controller;

import com.leigq.commodity.bean.Response;
import com.leigq.commodity.domain.entity.Commodity;
import com.leigq.commodity.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private Response response;

    /**
     * 根据商品id查询商品
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 16:48
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     * @param cId 商品id
     * @return 对应id的商品
     */
    @GetMapping("/commodities/{id}")
    public Response getCommodities(@PathVariable("id") Long cId) {
        return response.success(commodityService.getCommodities(cId));
    }

}

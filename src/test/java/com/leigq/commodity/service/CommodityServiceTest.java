package com.leigq.commodity.service;

import com.leigq.commodity.CommodityApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

/**
 * 商品服务测试
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 18:06 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Component
@Slf4j
public class CommodityServiceTest extends CommodityApplicationTests {

    @Autowired
    private CommodityService commodityService;

    @Test
    public void listCommodities() {
        log.warn("listCommodities:{}", commodityService.listCommodities());
    }
}
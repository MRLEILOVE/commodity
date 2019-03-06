package com.leigq.commodity.service;

import com.leigq.commodity.dao.CommodityTypeRepository;
import com.leigq.commodity.entity.CommodityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品类型
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 15:39 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Service
@Transactional
public class CommodityTypeService {

    @Autowired
    private CommodityTypeRepository commodityTypeRepository;

    public List<CommodityType> listCommodityTypes() {
        return commodityTypeRepository.findAll();
    }
}

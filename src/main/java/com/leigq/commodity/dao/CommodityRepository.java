package com.leigq.commodity.dao;

import com.leigq.commodity.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  商品
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 16:45 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
public interface CommodityRepository extends JpaRepository<Commodity, Long> {

}

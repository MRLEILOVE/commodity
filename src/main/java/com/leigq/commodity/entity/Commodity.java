package com.leigq.commodity.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 *  商品实体
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 15:04 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Data
@Entity
public class Commodity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private BigDecimal price;

    private Long ctId;

}

package com.lx.benefits.bean.dto.sch;


import com.lx.benefits.bean.dto.jd.base.BaseDO;

/**
 * Created by ldr on 2016/2/29.
 */
public class BrandRange extends BaseDO {

    private Long brandId;

    private Integer sort;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

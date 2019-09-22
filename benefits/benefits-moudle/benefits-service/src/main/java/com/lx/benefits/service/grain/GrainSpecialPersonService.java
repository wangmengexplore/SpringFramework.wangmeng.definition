package com.lx.benefits.service.grain;

import com.lx.benefits.bean.dto.grain.GrainSpecialPerson;

import java.util.List;
import java.util.Map;

/**
 * User:wangmeng
 * Date:2019/5/20
 * Time:11:58
 * Verision:2.x
 * Description:TODO
 **/
public interface GrainSpecialPersonService {

    int delete(Long id);

    GrainSpecialPerson insert(GrainSpecialPerson grainSpecialPerson);


    int updateByPrimaryKeySelective(GrainSpecialPerson grainSpecialPerson);


    List<GrainSpecialPerson> findGrainSpecialPersonList(Map<String,Object> params);


    GrainSpecialPerson selectByPrimaryKey(Long id);

    Integer countGrainSpecialPersonList(Map<String,Object> params);
}
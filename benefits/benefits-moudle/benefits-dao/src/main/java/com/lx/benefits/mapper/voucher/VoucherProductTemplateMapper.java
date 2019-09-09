package com.lx.benefits.mapper.voucher;

import com.lx.benefits.bean.entity.voucher.VoucherProductTemplate;
import com.lx.benefits.bean.entity.voucher.VoucherProductTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoucherProductTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int countByExample(VoucherProductTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int deleteByExample(VoucherProductTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long templateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int insert(VoucherProductTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int insertSelective(VoucherProductTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    List<VoucherProductTemplate> selectByExample(VoucherProductTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    VoucherProductTemplate selectByPrimaryKey(Long templateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VoucherProductTemplate record, @Param("example") VoucherProductTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VoucherProductTemplate record, @Param("example") VoucherProductTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(VoucherProductTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_product_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VoucherProductTemplate record);
}

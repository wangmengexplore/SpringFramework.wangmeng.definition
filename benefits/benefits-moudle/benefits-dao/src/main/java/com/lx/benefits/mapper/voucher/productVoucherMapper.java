package com.lx.benefits.mapper.voucher;

import com.lx.benefits.bean.entity.voucher.productVoucher;
import com.lx.benefits.bean.entity.voucher.productVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productVoucherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int countByExample(productVoucherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int deleteByExample(productVoucherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int insert(productVoucher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int insertSelective(productVoucher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    List<productVoucher> selectByExample(productVoucherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    productVoucher selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") productVoucher record,
                                 @Param("example") productVoucherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") productVoucher record, @Param("example") productVoucherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(productVoucher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_voucher
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(productVoucher record);
}

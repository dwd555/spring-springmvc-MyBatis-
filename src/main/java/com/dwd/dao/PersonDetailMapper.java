package com.dwd.dao;

import com.dwd.pojo.PersonDetail;

public interface PersonDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    int insert(PersonDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    int insertSelective(PersonDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    PersonDetail selectByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PersonDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PersonDetail record);
}
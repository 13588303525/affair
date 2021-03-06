package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.Evection;
import cn.zucc.affair.pojo.EvectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvectionMapper {
    int countByExample(EvectionExample example);

    int deleteByExample(EvectionExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(Evection record);

    int insertSelective(Evection record);

    List<Evection> selectByExample(EvectionExample example);

    Evection selectByPrimaryKey(Integer eId);

    int updateByExampleSelective(@Param("record") Evection record, @Param("example") EvectionExample example);

    int updateByExample(@Param("record") Evection record, @Param("example") EvectionExample example);

    int updateByPrimaryKeySelective(Evection record);

    int updateByPrimaryKey(Evection record);
}
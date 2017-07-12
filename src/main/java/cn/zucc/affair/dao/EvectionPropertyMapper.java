package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.EvectionProperty;
import cn.zucc.affair.pojo.EvectionPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvectionPropertyMapper {
    int countByExample(EvectionPropertyExample example);

    int deleteByExample(EvectionPropertyExample example);

    int deleteByPrimaryKey(Integer epId);

    int insert(EvectionProperty record);

    int insertSelective(EvectionProperty record);

    List<EvectionProperty> selectByExample(EvectionPropertyExample example);

    EvectionProperty selectByPrimaryKey(Integer epId);

    int updateByExampleSelective(@Param("record") EvectionProperty record, @Param("example") EvectionPropertyExample example);

    int updateByExample(@Param("record") EvectionProperty record, @Param("example") EvectionPropertyExample example);

    int updateByPrimaryKeySelective(EvectionProperty record);

    int updateByPrimaryKey(EvectionProperty record);
}
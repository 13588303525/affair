package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.SummaryProperty;
import cn.zucc.affair.pojo.SummaryPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SummaryPropertyMapper {
    int countByExample(SummaryPropertyExample example);

    int deleteByExample(SummaryPropertyExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SummaryProperty record);

    int insertSelective(SummaryProperty record);

    List<SummaryProperty> selectByExample(SummaryPropertyExample example);

    SummaryProperty selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SummaryProperty record, @Param("example") SummaryPropertyExample example);

    int updateByExample(@Param("record") SummaryProperty record, @Param("example") SummaryPropertyExample example);

    int updateByPrimaryKeySelective(SummaryProperty record);

    int updateByPrimaryKey(SummaryProperty record);
}
package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.Summary;
import cn.zucc.affair.pojo.SummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SummaryMapper {
    int countByExample(SummaryExample example);

    int deleteByExample(SummaryExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Summary record);

    int insertSelective(Summary record);

    List<Summary> selectByExample(SummaryExample example);

    Summary selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByExample(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByPrimaryKeySelective(Summary record);

    int updateByPrimaryKey(Summary record);
}
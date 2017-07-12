package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.RealSummaryCost;
import cn.zucc.affair.pojo.RealSummaryCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealSummaryCostMapper {
    int countByExample(RealSummaryCostExample example);

    int deleteByExample(RealSummaryCostExample example);

    int deleteByPrimaryKey(Integer rsId);

    int insert(RealSummaryCost record);

    int insertSelective(RealSummaryCost record);

    List<RealSummaryCost> selectByExample(RealSummaryCostExample example);

    RealSummaryCost selectByPrimaryKey(Integer rsId);

    int updateByExampleSelective(@Param("record") RealSummaryCost record, @Param("example") RealSummaryCostExample example);

    int updateByExample(@Param("record") RealSummaryCost record, @Param("example") RealSummaryCostExample example);

    int updateByPrimaryKeySelective(RealSummaryCost record);

    int updateByPrimaryKey(RealSummaryCost record);
}
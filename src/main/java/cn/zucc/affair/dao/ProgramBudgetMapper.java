package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.ProgramBudget;
import cn.zucc.affair.pojo.ProgramBudgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramBudgetMapper {
    int countByExample(ProgramBudgetExample example);

    int deleteByExample(ProgramBudgetExample example);

    int deleteByPrimaryKey(Integer pbId);

    int insert(ProgramBudget record);

    int insertSelective(ProgramBudget record);

    List<ProgramBudget> selectByExample(ProgramBudgetExample example);

    ProgramBudget selectByPrimaryKey(Integer pbId);

    int updateByExampleSelective(@Param("record") ProgramBudget record, @Param("example") ProgramBudgetExample example);

    int updateByExample(@Param("record") ProgramBudget record, @Param("example") ProgramBudgetExample example);

    int updateByPrimaryKeySelective(ProgramBudget record);

    int updateByPrimaryKey(ProgramBudget record);
}
package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.Program;
import cn.zucc.affair.pojo.ProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramMapper {
    int countByExample(ProgramExample example);

    int deleteByExample(ProgramExample example);

    int deleteByPrimaryKey(Integer pgId);

    int insert(Program record);

    int insertSelective(Program record);

    List<Program> selectByExample(ProgramExample example);

    Program selectByPrimaryKey(Integer pgId);

    int updateByExampleSelective(@Param("record") Program record, @Param("example") ProgramExample example);

    int updateByExample(@Param("record") Program record, @Param("example") ProgramExample example);

    int updateByPrimaryKeySelective(Program record);

    int updateByPrimaryKey(Program record);
}
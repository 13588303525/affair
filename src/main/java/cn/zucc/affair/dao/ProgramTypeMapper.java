package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.ProgramType;
import cn.zucc.affair.pojo.ProgramTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramTypeMapper {
    int countByExample(ProgramTypeExample example);

    int deleteByExample(ProgramTypeExample example);

    int deleteByPrimaryKey(Integer pgTypeId);

    int insert(ProgramType record);

    int insertSelective(ProgramType record);

    List<ProgramType> selectByExample(ProgramTypeExample example);

    ProgramType selectByPrimaryKey(Integer pgTypeId);

    int updateByExampleSelective(@Param("record") ProgramType record, @Param("example") ProgramTypeExample example);

    int updateByExample(@Param("record") ProgramType record, @Param("example") ProgramTypeExample example);

    int updateByPrimaryKeySelective(ProgramType record);

    int updateByPrimaryKey(ProgramType record);
}
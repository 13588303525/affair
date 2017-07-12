package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.UserProgram;
import cn.zucc.affair.pojo.UserProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProgramMapper {
    int countByExample(UserProgramExample example);

    int deleteByExample(UserProgramExample example);

    int deleteByPrimaryKey(Integer upId);

    int insert(UserProgram record);

    int insertSelective(UserProgram record);

    List<UserProgram> selectByExample(UserProgramExample example);

    UserProgram selectByPrimaryKey(Integer upId);

    int updateByExampleSelective(@Param("record") UserProgram record, @Param("example") UserProgramExample example);

    int updateByExample(@Param("record") UserProgram record, @Param("example") UserProgramExample example);

    int updateByPrimaryKeySelective(UserProgram record);

    int updateByPrimaryKey(UserProgram record);
}
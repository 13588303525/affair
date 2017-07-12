package cn.zucc.affair.dao;

import cn.zucc.affair.pojo.User;
import cn.zucc.affair.pojo.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String uId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String uId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    List<User> getList(cn.zucc.affair.pojo.SearchPageUtil searchPageUtil);  
    
    /** 
     * 根据条件获取总数 
     *  
     * @param test 
     * @return 
     */  
    int getCount(User record);  
    
}
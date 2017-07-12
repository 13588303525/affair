package cn.zucc.affair.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.zucc.affair.dao.UserMapper;
import cn.zucc.affair.pojo.Page;
import cn.zucc.affair.pojo.SearchPageUtil;
import cn.zucc.affair.pojo.User;

@Service("userService")
public class UserService {
	@Resource
	private UserMapper userMapper;
	
	
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}
	public void addUser(User user){
		userMapper.insert(user);
	}
	
	
	public List<User> getList(User user, Page page) {  
        SearchPageUtil searchPageUtil = new SearchPageUtil();  
        String a[] = { "name  desc", "id asc" };  
        searchPageUtil.setOrderBys(a);  
        searchPageUtil.setPage(page);  
        searchPageUtil.setObject(user);  
        final List<User> list = userMapper.getList(searchPageUtil);  
        for(int i=0;i<list.size();i++){
        	User temp = (User) list.get(i);
        	System.out.println("id:"+temp.getuId());
        }
    
        return list;  
    }  
    public int getCount(User user) {  
        return userMapper.getCount(user);  
    }
}
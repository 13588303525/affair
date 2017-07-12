package cn.zucc.affair.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.zucc.affair.pojo.Page;
import cn.zucc.affair.pojo.User;
import cn.zucc.affair.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping("/showUser")	
	public String toIndex(HttpServletRequest request, User user,Model model){
	    
		//System.out.println(user.getuId());
		System.out.println(user.getuId());
		user = this.userService.getUserById(user.getuId());
		if(user==null)
			System.out.println("NULL");
		else
			System.out.println(user.getuName());		
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping(value = "/query", method = RequestMethod.POST)  
	public String query(HttpServletRequest request, Map<String, Object> map) {  
	    User user = new User();  
	    int listSize = userService.getCount(user);
	    // 默认为pageNow = 1  
	    Page page = new Page(1,6,listSize);  
	   
	    List<User> list = userService.getList(user, page);
	    map.put("page", page);  
	    map.put("list", list);  
	    return "user-list";  
	}  
	
	//获取json对象  
	@RequestMapping(value = "/queryByCriteria", method = RequestMethod.POST)  
	public @ResponseBody Map<String, Object> queryByFoodPrice(HttpServletRequest request
			,@RequestBody User user) {  
		System.out.println("queryByCriteria....");
	    Map<String, Object> map = new HashMap<String, Object>();  
	    String pageNow = request.getParameter("pn");  
	    int pn = 1;  
	    if (pageNow != "" & pageNow != null) {  
	        pn = new Integer(pageNow);  
	    }  
	    int listSize = userService.getCount(user);
	    System.out.println("listSize:"+listSize);
	    Page page = new Page(pn,6,listSize);   
	    List<User> list = userService.getList(user, page); 
	    map.put("page", page);  
	    map.put("list", list);  
	    return map;  
	}  
	
	
	@RequestMapping("/getUserList")
	public String list(HttpServletRequest request,User user,Page page,Integer pageSize,Integer pageIndex){
		
    	if(user!=null){
    		System.out.println("userid:"+user.getuId());
    	}else{
    		System.out.println("user == null");
    	}
    	if(pageSize==null||pageIndex==null)
    		page = new Page(1,6,userService.getCount(user));
    	else
    		page = new Page(pageIndex,pageSize,userService.getCount(user));
    	System.out.println("username:"+user.getuName());
    	request.getSession().setAttribute("user",user);
    	request.getSession().setAttribute("users", userService.getList(user, page));
    	request.getSession().setAttribute("page", page);
		return "user-list";
	}
	
	@RequestMapping("/showUser2")
	public String toIndex2(User user){
		
		String userid = user.getuId();
		System.out.println(userid);

	    user = this.userService.getUserById(userid);
		if(user==null)
			System.out.println("NULL");
		else
			System.out.println(user.getuName());
		
		return "showUser";
	}
	
    @RequestMapping(value = "/saveUser", method = {RequestMethod.POST }) 
    public @ResponseBody void saveUser(@RequestBody User user) { 
    	 if(user!=null)
             System.out.println(user.getuId());
    	 else
    		 System.out.println("NO");
    	 userService.addUser(user);
 
    	 logger.info(JSON.toJSONString(user));
    }
    
    @InitBinder("user")
    public void initBinder(WebDataBinder binder){
    	binder.setFieldDefaultPrefix("user.");
    }
    @RequestMapping(value = "/saveUser2", method = {RequestMethod.POST }) 
    public @ResponseBody void saveUser2(User user) { 
    	 if(user!=null)
             System.out.println(user.getuId());
    	 else
    		 System.out.println("NO");
    	 userService.addUser(user);
 
    	 logger.info(JSON.toJSONString(user));
    }
	
}
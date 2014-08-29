package com.liujl.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.liujl.model.Emp;
import com.liujl.propediter.DateEditor;

public class EmpMultiActionController extends MultiActionController {
	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
			/*使用springmvc提供的半成品	CustomDateEditor,spring之所以只提供半成品，是因为它不知道页面的Date字符串是什么样子的*/
//			binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd HH:MM:SS"), true));
			
			//或者可以使用自定义属性编辑器com.liujl.propediter.DateEditor
			binder.registerCustomEditor(Date.class, new DateEditor());
	}
	
	public ModelAndView to_add(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelandView=new ModelAndView();
		modelandView.addObject("deptList", new String[]{"xingzheng","program"});//model数据
		modelandView.setViewName("add_emp");//view的名称，交给UrlBasedViewResolver处理，最后拼成add_emp.jsp
		return modelandView;
	}
	
	public String add_emp(HttpServletRequest request,HttpServletResponse response,Emp emp) {
		System.out.println(emp.toString());
		return "success";
	}

	
	
}

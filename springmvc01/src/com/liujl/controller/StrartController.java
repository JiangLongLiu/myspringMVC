package com.liujl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class StrartController implements Controller {
	private static final Logger logger = (Logger) LogManager.getLogger(StrartController.class.getName());
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		logger.debug("*********** start controller!");
		//返回一个视图+模型（模型没有数据，目前直返回了一个试图名 ）
		return new ModelAndView("start");
	}

}

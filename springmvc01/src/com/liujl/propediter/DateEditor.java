package com.liujl.propediter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class DateEditor extends PropertiesEditor {

	/**
	 * 按这个方法得到
	 */
	@Override
	public String getAsText() {
		return new SimpleDateFormat().format(this.getValue()+"");
	}
	
	/**
	 * 来自页面的date进行转换
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		 if (text == null || text.equals("")) {    
	            text = "1970-01-01";    
	        }    
	        try {
				setValue(new SimpleDateFormat("yyyy-MM-dd").parse(text));
			} catch (ParseException e) {
				e.printStackTrace();
			} 
	}

}

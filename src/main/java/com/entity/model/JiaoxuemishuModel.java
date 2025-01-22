package com.entity.model;

import com.entity.JiaoxuemishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教学秘书
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public class JiaoxuemishuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 秘书姓名
	 */
	
	private String mishuxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 秘书电话
	 */
	
	private String mishudianhua;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：秘书姓名
	 */
	 
	public void setMishuxingming(String mishuxingming) {
		this.mishuxingming = mishuxingming;
	}
	
	/**
	 * 获取：秘书姓名
	 */
	public String getMishuxingming() {
		return mishuxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：秘书电话
	 */
	 
	public void setMishudianhua(String mishudianhua) {
		this.mishudianhua = mishudianhua;
	}
	
	/**
	 * 获取：秘书电话
	 */
	public String getMishudianhua() {
		return mishudianhua;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}

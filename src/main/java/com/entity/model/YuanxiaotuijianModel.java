package com.entity.model;

import com.entity.YuanxiaotuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 院校推荐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public class YuanxiaotuijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 院校名称
	 */
	
	private String yuanxiaomingcheng;
		
	/**
	 * 院校地址
	 */
	
	private String yuanxiaodizhi;
		
	/**
	 * 院校封面
	 */
	
	private String yuanxiaofengmian;
		
	/**
	 * 院校专业
	 */
	
	private String yuanxiaozhuanye;
		
	/**
	 * 院校详情
	 */
	
	private String yuanxiaoxiangqing;
		
	/**
	 * 秘书账号
	 */
	
	private String mishuzhanghao;
		
	/**
	 * 秘书姓名
	 */
	
	private String mishuxingming;
				
	
	/**
	 * 设置：院校名称
	 */
	 
	public void setYuanxiaomingcheng(String yuanxiaomingcheng) {
		this.yuanxiaomingcheng = yuanxiaomingcheng;
	}
	
	/**
	 * 获取：院校名称
	 */
	public String getYuanxiaomingcheng() {
		return yuanxiaomingcheng;
	}
				
	
	/**
	 * 设置：院校地址
	 */
	 
	public void setYuanxiaodizhi(String yuanxiaodizhi) {
		this.yuanxiaodizhi = yuanxiaodizhi;
	}
	
	/**
	 * 获取：院校地址
	 */
	public String getYuanxiaodizhi() {
		return yuanxiaodizhi;
	}
				
	
	/**
	 * 设置：院校封面
	 */
	 
	public void setYuanxiaofengmian(String yuanxiaofengmian) {
		this.yuanxiaofengmian = yuanxiaofengmian;
	}
	
	/**
	 * 获取：院校封面
	 */
	public String getYuanxiaofengmian() {
		return yuanxiaofengmian;
	}
				
	
	/**
	 * 设置：院校专业
	 */
	 
	public void setYuanxiaozhuanye(String yuanxiaozhuanye) {
		this.yuanxiaozhuanye = yuanxiaozhuanye;
	}
	
	/**
	 * 获取：院校专业
	 */
	public String getYuanxiaozhuanye() {
		return yuanxiaozhuanye;
	}
				
	
	/**
	 * 设置：院校详情
	 */
	 
	public void setYuanxiaoxiangqing(String yuanxiaoxiangqing) {
		this.yuanxiaoxiangqing = yuanxiaoxiangqing;
	}
	
	/**
	 * 获取：院校详情
	 */
	public String getYuanxiaoxiangqing() {
		return yuanxiaoxiangqing;
	}
				
	
	/**
	 * 设置：秘书账号
	 */
	 
	public void setMishuzhanghao(String mishuzhanghao) {
		this.mishuzhanghao = mishuzhanghao;
	}
	
	/**
	 * 获取：秘书账号
	 */
	public String getMishuzhanghao() {
		return mishuzhanghao;
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
			
}

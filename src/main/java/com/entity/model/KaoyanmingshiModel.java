package com.entity.model;

import com.entity.KaoyanmingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 考研名师
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public class KaoyanmingshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 名师名称
	 */
	
	private String mingshimingcheng;
		
	/**
	 * 视频资料
	 */
	
	private String shipinziliao;
		
	/**
	 * 考研详情
	 */
	
	private String kaoyanxiangqing;
		
	/**
	 * 秘书账号
	 */
	
	private String mishuzhanghao;
		
	/**
	 * 秘书姓名
	 */
	
	private String mishuxingming;
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：名师名称
	 */
	 
	public void setMingshimingcheng(String mingshimingcheng) {
		this.mingshimingcheng = mingshimingcheng;
	}
	
	/**
	 * 获取：名师名称
	 */
	public String getMingshimingcheng() {
		return mingshimingcheng;
	}
				
	
	/**
	 * 设置：视频资料
	 */
	 
	public void setShipinziliao(String shipinziliao) {
		this.shipinziliao = shipinziliao;
	}
	
	/**
	 * 获取：视频资料
	 */
	public String getShipinziliao() {
		return shipinziliao;
	}
				
	
	/**
	 * 设置：考研详情
	 */
	 
	public void setKaoyanxiangqing(String kaoyanxiangqing) {
		this.kaoyanxiangqing = kaoyanxiangqing;
	}
	
	/**
	 * 获取：考研详情
	 */
	public String getKaoyanxiangqing() {
		return kaoyanxiangqing;
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

package com.entity.vo;

import com.entity.KaoyanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考研信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public class KaoyanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考试科目
	 */
	
	private String kaoshikemu;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 报名时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingshijian;
		
	/**
	 * 确认时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date querenshijian;
		
	/**
	 * 录取分数
	 */
	
	private Float luqufenshu;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 秘书账号
	 */
	
	private String mishuzhanghao;
		
	/**
	 * 秘书姓名
	 */
	
	private String mishuxingming;
				
	
	/**
	 * 设置：考试科目
	 */
	 
	public void setKaoshikemu(String kaoshikemu) {
		this.kaoshikemu = kaoshikemu;
	}
	
	/**
	 * 获取：考试科目
	 */
	public String getKaoshikemu() {
		return kaoshikemu;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
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
	 * 设置：报名时间
	 */
	 
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
				
	
	/**
	 * 设置：确认时间
	 */
	 
	public void setQuerenshijian(Date querenshijian) {
		this.querenshijian = querenshijian;
	}
	
	/**
	 * 获取：确认时间
	 */
	public Date getQuerenshijian() {
		return querenshijian;
	}
				
	
	/**
	 * 设置：录取分数
	 */
	 
	public void setLuqufenshu(Float luqufenshu) {
		this.luqufenshu = luqufenshu;
	}
	
	/**
	 * 获取：录取分数
	 */
	public Float getLuqufenshu() {
		return luqufenshu;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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

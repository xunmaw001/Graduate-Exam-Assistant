package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考研信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@TableName("kaoyanxinxi")
public class KaoyanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoyanxinxiEntity() {
		
	}
	
	public KaoyanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考研专业
	 */
					
	private String kaoyanzhuanye;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date baomingshijian;
	
	/**
	 * 确认时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考研专业
	 */
	public void setKaoyanzhuanye(String kaoyanzhuanye) {
		this.kaoyanzhuanye = kaoyanzhuanye;
	}
	/**
	 * 获取：考研专业
	 */
	public String getKaoyanzhuanye() {
		return kaoyanzhuanye;
	}
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

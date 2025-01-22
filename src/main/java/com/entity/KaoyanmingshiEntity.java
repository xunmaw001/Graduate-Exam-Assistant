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
 * 考研名师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@TableName("kaoyanmingshi")
public class KaoyanmingshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoyanmingshiEntity() {
		
	}
	
	public KaoyanmingshiEntity(T t) {
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
	 * 考研标题
	 */
					
	private String kaoyanbiaoti;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：考研标题
	 */
	public void setKaoyanbiaoti(String kaoyanbiaoti) {
		this.kaoyanbiaoti = kaoyanbiaoti;
	}
	/**
	 * 获取：考研标题
	 */
	public String getKaoyanbiaoti() {
		return kaoyanbiaoti;
	}
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

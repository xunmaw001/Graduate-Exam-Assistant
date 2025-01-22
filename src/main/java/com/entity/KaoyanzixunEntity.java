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
 * 考研资讯
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@TableName("kaoyanzixun")
public class KaoyanzixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoyanzixunEntity() {
		
	}
	
	public KaoyanzixunEntity(T t) {
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
	 * 资讯编号
	 */
					
	private String zixunbianhao;
	
	/**
	 * 资讯标题
	 */
					
	private String zixunbiaoti;
	
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
	 * 资讯内容
	 */
					
	private String zixunneirong;
	
	/**
	 * 秘书账号
	 */
					
	private String mishuzhanghao;
	
	/**
	 * 秘书姓名
	 */
					
	private String mishuxingming;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：资讯编号
	 */
	public void setZixunbianhao(String zixunbianhao) {
		this.zixunbianhao = zixunbianhao;
	}
	/**
	 * 获取：资讯编号
	 */
	public String getZixunbianhao() {
		return zixunbianhao;
	}
	/**
	 * 设置：资讯标题
	 */
	public void setZixunbiaoti(String zixunbiaoti) {
		this.zixunbiaoti = zixunbiaoti;
	}
	/**
	 * 获取：资讯标题
	 */
	public String getZixunbiaoti() {
		return zixunbiaoti;
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
	 * 设置：资讯内容
	 */
	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}
	/**
	 * 获取：资讯内容
	 */
	public String getZixunneirong() {
		return zixunneirong;
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
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}

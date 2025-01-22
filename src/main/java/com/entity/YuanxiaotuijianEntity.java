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
 * 院校推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@TableName("yuanxiaotuijian")
public class YuanxiaotuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxiaotuijianEntity() {
		
	}
	
	public YuanxiaotuijianEntity(T t) {
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
	 * 院校编号
	 */
					
	private String yuanxiaobianhao;
	
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
	 * 设置：院校编号
	 */
	public void setYuanxiaobianhao(String yuanxiaobianhao) {
		this.yuanxiaobianhao = yuanxiaobianhao;
	}
	/**
	 * 获取：院校编号
	 */
	public String getYuanxiaobianhao() {
		return yuanxiaobianhao;
	}
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

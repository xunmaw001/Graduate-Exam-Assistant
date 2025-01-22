package com.entity.view;

import com.entity.YuanxiaotuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院校推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@TableName("yuanxiaotuijian")
public class YuanxiaotuijianView  extends YuanxiaotuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiaotuijianView(){
	}
 
 	public YuanxiaotuijianView(YuanxiaotuijianEntity yuanxiaotuijianEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiaotuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

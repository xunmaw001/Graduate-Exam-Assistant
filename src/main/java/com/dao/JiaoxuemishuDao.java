package com.dao;

import com.entity.JiaoxuemishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuemishuVO;
import com.entity.view.JiaoxuemishuView;


/**
 * 教学秘书
 * 
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface JiaoxuemishuDao extends BaseMapper<JiaoxuemishuEntity> {
	
	List<JiaoxuemishuVO> selectListVO(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
	
	JiaoxuemishuVO selectVO(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
	
	List<JiaoxuemishuView> selectListView(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);

	List<JiaoxuemishuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
	
	JiaoxuemishuView selectView(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
	

}

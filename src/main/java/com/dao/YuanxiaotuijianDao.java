package com.dao;

import com.entity.YuanxiaotuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiaotuijianVO;
import com.entity.view.YuanxiaotuijianView;


/**
 * 院校推荐
 * 
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface YuanxiaotuijianDao extends BaseMapper<YuanxiaotuijianEntity> {
	
	List<YuanxiaotuijianVO> selectListVO(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
	
	YuanxiaotuijianVO selectVO(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
	
	List<YuanxiaotuijianView> selectListView(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);

	List<YuanxiaotuijianView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
	
	YuanxiaotuijianView selectView(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
	

}

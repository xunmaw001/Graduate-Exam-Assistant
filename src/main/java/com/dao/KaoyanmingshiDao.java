package com.dao;

import com.entity.KaoyanmingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanmingshiVO;
import com.entity.view.KaoyanmingshiView;


/**
 * 考研名师
 * 
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface KaoyanmingshiDao extends BaseMapper<KaoyanmingshiEntity> {
	
	List<KaoyanmingshiVO> selectListVO(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
	
	KaoyanmingshiVO selectVO(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
	
	List<KaoyanmingshiView> selectListView(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);

	List<KaoyanmingshiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
	
	KaoyanmingshiView selectView(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
	

}

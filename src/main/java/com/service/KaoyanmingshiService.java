package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanmingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanmingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanmingshiView;


/**
 * 考研名师
 *
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface KaoyanmingshiService extends IService<KaoyanmingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanmingshiVO> selectListVO(Wrapper<KaoyanmingshiEntity> wrapper);
   	
   	KaoyanmingshiVO selectVO(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
   	
   	List<KaoyanmingshiView> selectListView(Wrapper<KaoyanmingshiEntity> wrapper);
   	
   	KaoyanmingshiView selectView(@Param("ew") Wrapper<KaoyanmingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanmingshiEntity> wrapper);
   	

}


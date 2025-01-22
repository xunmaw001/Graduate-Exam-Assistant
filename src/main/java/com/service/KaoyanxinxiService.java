package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanxinxiView;


/**
 * 考研信息
 *
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface KaoyanxinxiService extends IService<KaoyanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanxinxiVO> selectListVO(Wrapper<KaoyanxinxiEntity> wrapper);
   	
   	KaoyanxinxiVO selectVO(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
   	
   	List<KaoyanxinxiView> selectListView(Wrapper<KaoyanxinxiEntity> wrapper);
   	
   	KaoyanxinxiView selectView(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanxinxiEntity> wrapper);
   	

}


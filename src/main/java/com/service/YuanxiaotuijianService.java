package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiaotuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiaotuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiaotuijianView;


/**
 * 院校推荐
 *
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface YuanxiaotuijianService extends IService<YuanxiaotuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiaotuijianVO> selectListVO(Wrapper<YuanxiaotuijianEntity> wrapper);
   	
   	YuanxiaotuijianVO selectVO(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
   	
   	List<YuanxiaotuijianView> selectListView(Wrapper<YuanxiaotuijianEntity> wrapper);
   	
   	YuanxiaotuijianView selectView(@Param("ew") Wrapper<YuanxiaotuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiaotuijianEntity> wrapper);
   	

}


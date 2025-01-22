package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuemishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuemishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuemishuView;


/**
 * 教学秘书
 *
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
public interface JiaoxuemishuService extends IService<JiaoxuemishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuemishuVO> selectListVO(Wrapper<JiaoxuemishuEntity> wrapper);
   	
   	JiaoxuemishuVO selectVO(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
   	
   	List<JiaoxuemishuView> selectListView(Wrapper<JiaoxuemishuEntity> wrapper);
   	
   	JiaoxuemishuView selectView(@Param("ew") Wrapper<JiaoxuemishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuemishuEntity> wrapper);
   	

}


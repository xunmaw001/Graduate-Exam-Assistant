package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxuemishuDao;
import com.entity.JiaoxuemishuEntity;
import com.service.JiaoxuemishuService;
import com.entity.vo.JiaoxuemishuVO;
import com.entity.view.JiaoxuemishuView;

@Service("jiaoxuemishuService")
public class JiaoxuemishuServiceImpl extends ServiceImpl<JiaoxuemishuDao, JiaoxuemishuEntity> implements JiaoxuemishuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuemishuEntity> page = this.selectPage(
                new Query<JiaoxuemishuEntity>(params).getPage(),
                new EntityWrapper<JiaoxuemishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuemishuEntity> wrapper) {
		  Page<JiaoxuemishuView> page =new Query<JiaoxuemishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuemishuVO> selectListVO(Wrapper<JiaoxuemishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuemishuVO selectVO(Wrapper<JiaoxuemishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuemishuView> selectListView(Wrapper<JiaoxuemishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuemishuView selectView(Wrapper<JiaoxuemishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

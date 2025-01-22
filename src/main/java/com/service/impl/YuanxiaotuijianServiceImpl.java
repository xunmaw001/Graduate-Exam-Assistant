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


import com.dao.YuanxiaotuijianDao;
import com.entity.YuanxiaotuijianEntity;
import com.service.YuanxiaotuijianService;
import com.entity.vo.YuanxiaotuijianVO;
import com.entity.view.YuanxiaotuijianView;

@Service("yuanxiaotuijianService")
public class YuanxiaotuijianServiceImpl extends ServiceImpl<YuanxiaotuijianDao, YuanxiaotuijianEntity> implements YuanxiaotuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiaotuijianEntity> page = this.selectPage(
                new Query<YuanxiaotuijianEntity>(params).getPage(),
                new EntityWrapper<YuanxiaotuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiaotuijianEntity> wrapper) {
		  Page<YuanxiaotuijianView> page =new Query<YuanxiaotuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiaotuijianVO> selectListVO(Wrapper<YuanxiaotuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiaotuijianVO selectVO(Wrapper<YuanxiaotuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiaotuijianView> selectListView(Wrapper<YuanxiaotuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiaotuijianView selectView(Wrapper<YuanxiaotuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.KaoyanmingshiDao;
import com.entity.KaoyanmingshiEntity;
import com.service.KaoyanmingshiService;
import com.entity.vo.KaoyanmingshiVO;
import com.entity.view.KaoyanmingshiView;

@Service("kaoyanmingshiService")
public class KaoyanmingshiServiceImpl extends ServiceImpl<KaoyanmingshiDao, KaoyanmingshiEntity> implements KaoyanmingshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanmingshiEntity> page = this.selectPage(
                new Query<KaoyanmingshiEntity>(params).getPage(),
                new EntityWrapper<KaoyanmingshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanmingshiEntity> wrapper) {
		  Page<KaoyanmingshiView> page =new Query<KaoyanmingshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanmingshiVO> selectListVO(Wrapper<KaoyanmingshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanmingshiVO selectVO(Wrapper<KaoyanmingshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanmingshiView> selectListView(Wrapper<KaoyanmingshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanmingshiView selectView(Wrapper<KaoyanmingshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

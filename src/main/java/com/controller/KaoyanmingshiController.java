package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KaoyanmingshiEntity;
import com.entity.view.KaoyanmingshiView;

import com.service.KaoyanmingshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 考研名师
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-13 20:13:49
 */
@RestController
@RequestMapping("/kaoyanmingshi")
public class KaoyanmingshiController {
    @Autowired
    private KaoyanmingshiService kaoyanmingshiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoyanmingshiEntity kaoyanmingshi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoxuemishu")) {
			kaoyanmingshi.setMishuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaoyanmingshiEntity> ew = new EntityWrapper<KaoyanmingshiEntity>();
		PageUtils page = kaoyanmingshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoyanmingshi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoyanmingshiEntity kaoyanmingshi, 
		HttpServletRequest request){
        EntityWrapper<KaoyanmingshiEntity> ew = new EntityWrapper<KaoyanmingshiEntity>();
		PageUtils page = kaoyanmingshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoyanmingshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoyanmingshiEntity kaoyanmingshi){
       	EntityWrapper<KaoyanmingshiEntity> ew = new EntityWrapper<KaoyanmingshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoyanmingshi, "kaoyanmingshi")); 
        return R.ok().put("data", kaoyanmingshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoyanmingshiEntity kaoyanmingshi){
        EntityWrapper< KaoyanmingshiEntity> ew = new EntityWrapper< KaoyanmingshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoyanmingshi, "kaoyanmingshi")); 
		KaoyanmingshiView kaoyanmingshiView =  kaoyanmingshiService.selectView(ew);
		return R.ok("查询考研名师成功").put("data", kaoyanmingshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoyanmingshiEntity kaoyanmingshi = kaoyanmingshiService.selectById(id);
        return R.ok().put("data", kaoyanmingshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoyanmingshiEntity kaoyanmingshi = kaoyanmingshiService.selectById(id);
        return R.ok().put("data", kaoyanmingshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoyanmingshiEntity kaoyanmingshi, HttpServletRequest request){
    	kaoyanmingshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoyanmingshi);

        kaoyanmingshiService.insert(kaoyanmingshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoyanmingshiEntity kaoyanmingshi, HttpServletRequest request){
    	kaoyanmingshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoyanmingshi);

        kaoyanmingshiService.insert(kaoyanmingshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoyanmingshiEntity kaoyanmingshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoyanmingshi);
        kaoyanmingshiService.updateById(kaoyanmingshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoyanmingshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KaoyanmingshiEntity> wrapper = new EntityWrapper<KaoyanmingshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoxuemishu")) {
			wrapper.eq("mishuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kaoyanmingshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

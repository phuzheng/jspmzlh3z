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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschongwubaikeEntity;
import com.entity.view.DiscusschongwubaikeView;

import com.service.DiscusschongwubaikeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宠物百科评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
@RestController
@RequestMapping("/discusschongwubaike")
public class DiscusschongwubaikeController {
    @Autowired
    private DiscusschongwubaikeService discusschongwubaikeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschongwubaikeEntity discusschongwubaike, HttpServletRequest request){

        EntityWrapper<DiscusschongwubaikeEntity> ew = new EntityWrapper<DiscusschongwubaikeEntity>();
    	PageUtils page = discusschongwubaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwubaike), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschongwubaikeEntity discusschongwubaike, HttpServletRequest request){
        EntityWrapper<DiscusschongwubaikeEntity> ew = new EntityWrapper<DiscusschongwubaikeEntity>();
    	PageUtils page = discusschongwubaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwubaike), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschongwubaikeEntity discusschongwubaike){
       	EntityWrapper<DiscusschongwubaikeEntity> ew = new EntityWrapper<DiscusschongwubaikeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwubaike, "discusschongwubaike")); 
        return R.ok().put("data", discusschongwubaikeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschongwubaikeEntity discusschongwubaike){
        EntityWrapper< DiscusschongwubaikeEntity> ew = new EntityWrapper< DiscusschongwubaikeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwubaike, "discusschongwubaike")); 
		DiscusschongwubaikeView discusschongwubaikeView =  discusschongwubaikeService.selectView(ew);
		return R.ok("查询宠物百科评论表成功").put("data", discusschongwubaikeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschongwubaikeEntity discusschongwubaike = discusschongwubaikeService.selectById(id);
        return R.ok().put("data", discusschongwubaike);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschongwubaikeEntity discusschongwubaike = discusschongwubaikeService.selectById(id);
        return R.ok().put("data", discusschongwubaike);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschongwubaikeEntity discusschongwubaike, HttpServletRequest request){
    	discusschongwubaike.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
    	//ValidatorUtils.validateEntity(discusschongwubaike);

        discusschongwubaikeService.insert(discusschongwubaike);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschongwubaikeEntity discusschongwubaike, HttpServletRequest request){
    	discusschongwubaike.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
    	//ValidatorUtils.validateEntity(discusschongwubaike);

        discusschongwubaikeService.insert(discusschongwubaike);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusschongwubaikeEntity discusschongwubaike, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwubaike);
        discusschongwubaikeService.updateById(discusschongwubaike);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwubaikeService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscusschongwubaikeEntity> wrapper = new EntityWrapper<DiscusschongwubaikeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschongwubaikeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

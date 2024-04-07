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

import com.entity.ChongwufuwujigouEntity;
import com.entity.view.ChongwufuwujigouView;

import com.service.ChongwufuwujigouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宠物服务机构
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
@RestController
@RequestMapping("/chongwufuwujigou")
public class ChongwufuwujigouController {
    @Autowired
    private ChongwufuwujigouService chongwufuwujigouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwufuwujigouEntity chongwufuwujigou, HttpServletRequest request){

        EntityWrapper<ChongwufuwujigouEntity> ew = new EntityWrapper<ChongwufuwujigouEntity>();
    	PageUtils page = chongwufuwujigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufuwujigou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwufuwujigouEntity chongwufuwujigou, HttpServletRequest request){
        EntityWrapper<ChongwufuwujigouEntity> ew = new EntityWrapper<ChongwufuwujigouEntity>();
    	PageUtils page = chongwufuwujigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufuwujigou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwufuwujigouEntity chongwufuwujigou){
       	EntityWrapper<ChongwufuwujigouEntity> ew = new EntityWrapper<ChongwufuwujigouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwufuwujigou, "chongwufuwujigou")); 
        return R.ok().put("data", chongwufuwujigouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwufuwujigouEntity chongwufuwujigou){
        EntityWrapper< ChongwufuwujigouEntity> ew = new EntityWrapper< ChongwufuwujigouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwufuwujigou, "chongwufuwujigou")); 
		ChongwufuwujigouView chongwufuwujigouView =  chongwufuwujigouService.selectView(ew);
		return R.ok("查询宠物服务机构成功").put("data", chongwufuwujigouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwufuwujigouEntity chongwufuwujigou = chongwufuwujigouService.selectById(id);
        return R.ok().put("data", chongwufuwujigou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwufuwujigouEntity chongwufuwujigou = chongwufuwujigouService.selectById(id);
        return R.ok().put("data", chongwufuwujigou);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChongwufuwujigouEntity chongwufuwujigou = chongwufuwujigouService.selectById(id);
        if(type.equals("1")) {
        	chongwufuwujigou.setThumbsupnum(chongwufuwujigou.getThumbsupnum()+1);
        } else {
        	chongwufuwujigou.setCrazilynum(chongwufuwujigou.getCrazilynum()+1);
        }
        chongwufuwujigouService.updateById(chongwufuwujigou);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwufuwujigouEntity chongwufuwujigou, HttpServletRequest request){
    	chongwufuwujigou.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
    	//ValidatorUtils.validateEntity(chongwufuwujigou);

        chongwufuwujigouService.insert(chongwufuwujigou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwufuwujigouEntity chongwufuwujigou, HttpServletRequest request){
    	chongwufuwujigou.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
    	//ValidatorUtils.validateEntity(chongwufuwujigou);

        chongwufuwujigouService.insert(chongwufuwujigou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwufuwujigouEntity chongwufuwujigou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwufuwujigou);
        chongwufuwujigouService.updateById(chongwufuwujigou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwufuwujigouService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChongwufuwujigouEntity> wrapper = new EntityWrapper<ChongwufuwujigouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chongwufuwujigouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

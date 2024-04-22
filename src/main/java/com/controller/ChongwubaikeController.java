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

import com.entity.ChongwubaikeEntity;
import com.entity.view.ChongwubaikeView;

import com.service.ChongwubaikeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宠物百科
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
@RestController
@RequestMapping("/chongwubaike")
public class ChongwubaikeController {
    @Autowired
    private ChongwubaikeService chongwubaikeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwubaikeEntity chongwubaike, HttpServletRequest request){
        EntityWrapper<ChongwubaikeEntity> ew = new EntityWrapper<ChongwubaikeEntity>();
    	PageUtils page = chongwubaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwubaike),
                params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);}

  //修改
    @RequestMapping("/update")
    public R update(@RequestBody ChongwubaikeEntity chongwubaike, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwubaike);
        chongwubaikeService.updateById(chongwubaike);//全部更新
        return R.ok();}
//删除
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwubaikeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
  //保存
    @RequestMapping("/save")
    public R save(@RequestBody ChongwubaikeEntity chongwubaike, HttpServletRequest request){
        chongwubaike.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
        //ValidatorUtils.validateEntity(chongwubaike);
        chongwubaikeService.insert(chongwubaike);
        return R.ok();}

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwubaikeEntity chongwubaike, HttpServletRequest request){
        EntityWrapper<ChongwubaikeEntity> ew = new EntityWrapper<ChongwubaikeEntity>();
        PageUtils page = chongwubaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwubaike), params), params));
        request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwubaikeEntity chongwubaike){
       	EntityWrapper<ChongwubaikeEntity> ew = new EntityWrapper<ChongwubaikeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwubaike, "chongwubaike")); 
        return R.ok().put("data", chongwubaikeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwubaikeEntity chongwubaike){
        EntityWrapper< ChongwubaikeEntity> ew = new EntityWrapper< ChongwubaikeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwubaike, "chongwubaike")); 
		ChongwubaikeView chongwubaikeView =  chongwubaikeService.selectView(ew);
		return R.ok("查询宠物百科成功").put("data", chongwubaikeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwubaikeEntity chongwubaike = chongwubaikeService.selectById(id);
        return R.ok().put("data", chongwubaike);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwubaikeEntity chongwubaike = chongwubaikeService.selectById(id);
        return R.ok().put("data", chongwubaike);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChongwubaikeEntity chongwubaike = chongwubaikeService.selectById(id);
        if(type.equals("1")) {
        	chongwubaike.setThumbsupnum(chongwubaike.getThumbsupnum()+1);
        } else {
        	chongwubaike.setCrazilynum(chongwubaike.getCrazilynum()+1);
        }
        chongwubaikeService.updateById(chongwubaike);
        return R.ok("投票成功");
    }


    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwubaikeEntity chongwubaike, HttpServletRequest request){
    	chongwubaike.setId(System.currentTimeMillis() + (long) Math.floor(Math.random() * 1000));
    	//ValidatorUtils.validateEntity(chongwubaike);
        chongwubaikeService.insert(chongwubaike);
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
		
		Wrapper<ChongwubaikeEntity> wrapper = new EntityWrapper<ChongwubaikeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chongwubaikeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

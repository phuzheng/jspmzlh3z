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


import com.dao.ChongwuleibieDao;
import com.entity.ChongwuleibieEntity;
import com.service.ChongwuleibieService;
import com.entity.vo.ChongwuleibieVO;
import com.entity.view.ChongwuleibieView;

@Service("chongwuleibieService")
public class ChongwuleibieServiceImpl extends ServiceImpl<ChongwuleibieDao, ChongwuleibieEntity> implements ChongwuleibieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuleibieEntity> page = this.selectPage(
                new Query<ChongwuleibieEntity>(params).getPage(),
                new EntityWrapper<ChongwuleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuleibieEntity> wrapper) {
		  Page<ChongwuleibieView> page =new Query<ChongwuleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuleibieVO> selectListVO(Wrapper<ChongwuleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuleibieVO selectVO(Wrapper<ChongwuleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuleibieView> selectListView(Wrapper<ChongwuleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuleibieView selectView(Wrapper<ChongwuleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

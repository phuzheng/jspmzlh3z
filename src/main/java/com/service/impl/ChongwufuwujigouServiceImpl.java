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


import com.dao.ChongwufuwujigouDao;
import com.entity.ChongwufuwujigouEntity;
import com.service.ChongwufuwujigouService;
import com.entity.vo.ChongwufuwujigouVO;
import com.entity.view.ChongwufuwujigouView;

@Service("chongwufuwujigouService")
public class ChongwufuwujigouServiceImpl extends ServiceImpl<ChongwufuwujigouDao, ChongwufuwujigouEntity> implements ChongwufuwujigouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwufuwujigouEntity> page = this.selectPage(
                new Query<ChongwufuwujigouEntity>(params).getPage(),
                new EntityWrapper<ChongwufuwujigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwufuwujigouEntity> wrapper) {
		  Page<ChongwufuwujigouView> page =new Query<ChongwufuwujigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwufuwujigouVO> selectListVO(Wrapper<ChongwufuwujigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwufuwujigouVO selectVO(Wrapper<ChongwufuwujigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwufuwujigouView> selectListView(Wrapper<ChongwufuwujigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwufuwujigouView selectView(Wrapper<ChongwufuwujigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

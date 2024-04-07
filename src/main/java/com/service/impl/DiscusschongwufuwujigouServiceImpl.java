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


import com.dao.DiscusschongwufuwujigouDao;
import com.entity.DiscusschongwufuwujigouEntity;
import com.service.DiscusschongwufuwujigouService;
import com.entity.vo.DiscusschongwufuwujigouVO;
import com.entity.view.DiscusschongwufuwujigouView;

@Service("discusschongwufuwujigouService")
public class DiscusschongwufuwujigouServiceImpl extends ServiceImpl<DiscusschongwufuwujigouDao, DiscusschongwufuwujigouEntity> implements DiscusschongwufuwujigouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwufuwujigouEntity> page = this.selectPage(
                new Query<DiscusschongwufuwujigouEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwufuwujigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwufuwujigouEntity> wrapper) {
		  Page<DiscusschongwufuwujigouView> page =new Query<DiscusschongwufuwujigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwufuwujigouVO> selectListVO(Wrapper<DiscusschongwufuwujigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwufuwujigouVO selectVO(Wrapper<DiscusschongwufuwujigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwufuwujigouView> selectListView(Wrapper<DiscusschongwufuwujigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwufuwujigouView selectView(Wrapper<DiscusschongwufuwujigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

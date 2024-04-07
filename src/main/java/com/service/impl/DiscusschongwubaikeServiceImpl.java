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


import com.dao.DiscusschongwubaikeDao;
import com.entity.DiscusschongwubaikeEntity;
import com.service.DiscusschongwubaikeService;
import com.entity.vo.DiscusschongwubaikeVO;
import com.entity.view.DiscusschongwubaikeView;

@Service("discusschongwubaikeService")
public class DiscusschongwubaikeServiceImpl extends ServiceImpl<DiscusschongwubaikeDao, DiscusschongwubaikeEntity> implements DiscusschongwubaikeService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwubaikeEntity> page = this.selectPage(
                new Query<DiscusschongwubaikeEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwubaikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwubaikeEntity> wrapper) {
		  Page<DiscusschongwubaikeView> page =new Query<DiscusschongwubaikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwubaikeVO> selectListVO(Wrapper<DiscusschongwubaikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwubaikeVO selectVO(Wrapper<DiscusschongwubaikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwubaikeView> selectListView(Wrapper<DiscusschongwubaikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwubaikeView selectView(Wrapper<DiscusschongwubaikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

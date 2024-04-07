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


import com.dao.ChongwubaikeDao;
import com.entity.ChongwubaikeEntity;
import com.service.ChongwubaikeService;
import com.entity.vo.ChongwubaikeVO;
import com.entity.view.ChongwubaikeView;

@Service("chongwubaikeService")
public class ChongwubaikeServiceImpl extends ServiceImpl<ChongwubaikeDao, ChongwubaikeEntity> implements ChongwubaikeService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwubaikeEntity> page = this.selectPage(
                new Query<ChongwubaikeEntity>(params).getPage(),
                new EntityWrapper<ChongwubaikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwubaikeEntity> wrapper) {
		  Page<ChongwubaikeView> page =new Query<ChongwubaikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwubaikeVO> selectListVO(Wrapper<ChongwubaikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwubaikeVO selectVO(Wrapper<ChongwubaikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwubaikeView> selectListView(Wrapper<ChongwubaikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwubaikeView selectView(Wrapper<ChongwubaikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

package com.dao;

import com.entity.ChongwufuwujigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwufuwujigouVO;
import com.entity.view.ChongwufuwujigouView;


/**
 * 宠物服务机构
 * 
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
public interface ChongwufuwujigouDao extends BaseMapper<ChongwufuwujigouEntity> {
	
	List<ChongwufuwujigouVO> selectListVO(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
	
	ChongwufuwujigouVO selectVO(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
	
	List<ChongwufuwujigouView> selectListView(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);

	List<ChongwufuwujigouView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
	
	ChongwufuwujigouView selectView(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
	
}

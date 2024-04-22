package com.dao;

import com.entity.ChongwubaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwubaikeVO;
import com.entity.view.ChongwubaikeView;


/**
 * 宠物百科
 * 
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface ChongwubaikeDao extends BaseMapper<ChongwubaikeEntity> {
	
	List<ChongwubaikeVO> selectListVO(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
	
	ChongwubaikeVO selectVO(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
	
	List<ChongwubaikeView> selectListView(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);

	List<ChongwubaikeView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
	
	ChongwubaikeView selectView(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
	
}

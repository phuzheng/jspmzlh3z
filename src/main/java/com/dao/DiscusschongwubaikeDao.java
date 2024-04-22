package com.dao;

import com.entity.DiscusschongwubaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwubaikeVO;
import com.entity.view.DiscusschongwubaikeView;


/**
 * 宠物百科评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface DiscusschongwubaikeDao extends BaseMapper<DiscusschongwubaikeEntity> {
	
	List<DiscusschongwubaikeVO> selectListVO(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
	
	DiscusschongwubaikeVO selectVO(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
	
	List<DiscusschongwubaikeView> selectListView(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);

	List<DiscusschongwubaikeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
	
	DiscusschongwubaikeView selectView(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
	
}

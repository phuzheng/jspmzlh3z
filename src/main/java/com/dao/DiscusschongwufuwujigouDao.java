package com.dao;

import com.entity.DiscusschongwufuwujigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwufuwujigouVO;
import com.entity.view.DiscusschongwufuwujigouView;


/**
 * 宠物服务机构评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface DiscusschongwufuwujigouDao extends BaseMapper<DiscusschongwufuwujigouEntity> {
	
	List<DiscusschongwufuwujigouVO> selectListVO(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
	
	DiscusschongwufuwujigouVO selectVO(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
	
	List<DiscusschongwufuwujigouView> selectListView(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);

	List<DiscusschongwufuwujigouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
	
	DiscusschongwufuwujigouView selectView(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
	
}

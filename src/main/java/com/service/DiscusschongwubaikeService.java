package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwubaikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwubaikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwubaikeView;


/**
 * 宠物百科评论表
 *
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface DiscusschongwubaikeService extends IService<DiscusschongwubaikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwubaikeVO> selectListVO(Wrapper<DiscusschongwubaikeEntity> wrapper);
   	
   	DiscusschongwubaikeVO selectVO(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
   	
   	List<DiscusschongwubaikeView> selectListView(Wrapper<DiscusschongwubaikeEntity> wrapper);
   	
   	DiscusschongwubaikeView selectView(@Param("ew") Wrapper<DiscusschongwubaikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwubaikeEntity> wrapper);
   	
}


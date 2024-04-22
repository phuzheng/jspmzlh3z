package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwufuwujigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwufuwujigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwufuwujigouView;


/**
 * 宠物服务机构评论表
 *
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface DiscusschongwufuwujigouService extends IService<DiscusschongwufuwujigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwufuwujigouVO> selectListVO(Wrapper<DiscusschongwufuwujigouEntity> wrapper);
   	
   	DiscusschongwufuwujigouVO selectVO(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
   	
   	List<DiscusschongwufuwujigouView> selectListView(Wrapper<DiscusschongwufuwujigouEntity> wrapper);
   	
   	DiscusschongwufuwujigouView selectView(@Param("ew") Wrapper<DiscusschongwufuwujigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwufuwujigouEntity> wrapper);
   	
}


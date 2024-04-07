package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwufuwujigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwufuwujigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwufuwujigouView;


/**
 * 宠物服务机构
 *
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
public interface ChongwufuwujigouService extends IService<ChongwufuwujigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwufuwujigouVO> selectListVO(Wrapper<ChongwufuwujigouEntity> wrapper);
   	
   	ChongwufuwujigouVO selectVO(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
   	
   	List<ChongwufuwujigouView> selectListView(Wrapper<ChongwufuwujigouEntity> wrapper);
   	
   	ChongwufuwujigouView selectView(@Param("ew") Wrapper<ChongwufuwujigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwufuwujigouEntity> wrapper);
   	
}


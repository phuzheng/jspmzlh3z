package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwubaikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwubaikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwubaikeView;


/**
 * 宠物百科
 *
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public interface ChongwubaikeService extends IService<ChongwubaikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwubaikeVO> selectListVO(Wrapper<ChongwubaikeEntity> wrapper);
   	
   	ChongwubaikeVO selectVO(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
   	
   	List<ChongwubaikeView> selectListView(Wrapper<ChongwubaikeEntity> wrapper);
   	
   	ChongwubaikeView selectView(@Param("ew") Wrapper<ChongwubaikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwubaikeEntity> wrapper);
   	
}


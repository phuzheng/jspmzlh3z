package com.entity.view;

import com.entity.ChongwufuwujigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物服务机构
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
@TableName("chongwufuwujigou")
public class ChongwufuwujigouView  extends ChongwufuwujigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwufuwujigouView(){
	}
 
 	public ChongwufuwujigouView(ChongwufuwujigouEntity chongwufuwujigouEntity){
 	try {
			BeanUtils.copyProperties(this, chongwufuwujigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

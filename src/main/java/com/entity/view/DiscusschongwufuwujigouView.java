package com.entity.view;

import com.entity.DiscusschongwufuwujigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物服务机构评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
@TableName("discusschongwufuwujigou")
public class DiscusschongwufuwujigouView  extends DiscusschongwufuwujigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwufuwujigouView(){
	}
 
 	public DiscusschongwufuwujigouView(DiscusschongwufuwujigouEntity discusschongwufuwujigouEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwufuwujigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

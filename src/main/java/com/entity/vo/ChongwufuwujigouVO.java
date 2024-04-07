package com.entity.vo;

import com.entity.ChongwufuwujigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宠物服务机构
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
public class ChongwufuwujigouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 机构类别
	 */
	
	private String jigouleibie;
		
	/**
	 * 机构简介
	 */
	
	private String jigoujianjie;
		
	/**
	 * 所在地点
	 */
	
	private String suozaididian;
		
	/**
	 * 平均消费
	 */
	
	private String pingjunxiaofei;
		
	/**
	 * 机构照片
	 */
	
	private String jigouzhaopian;
		
	/**
	 * 机构详情
	 */
	
	private String jigouxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：机构类别
	 */
	 
	public void setJigouleibie(String jigouleibie) {
		this.jigouleibie = jigouleibie;
	}
	
	/**
	 * 获取：机构类别
	 */
	public String getJigouleibie() {
		return jigouleibie;
	}
				
	
	/**
	 * 设置：机构简介
	 */
	 
	public void setJigoujianjie(String jigoujianjie) {
		this.jigoujianjie = jigoujianjie;
	}
	
	/**
	 * 获取：机构简介
	 */
	public String getJigoujianjie() {
		return jigoujianjie;
	}
				
	
	/**
	 * 设置：所在地点
	 */
	 
	public void setSuozaididian(String suozaididian) {
		this.suozaididian = suozaididian;
	}
	
	/**
	 * 获取：所在地点
	 */
	public String getSuozaididian() {
		return suozaididian;
	}
				
	
	/**
	 * 设置：平均消费
	 */
	 
	public void setPingjunxiaofei(String pingjunxiaofei) {
		this.pingjunxiaofei = pingjunxiaofei;
	}
	
	/**
	 * 获取：平均消费
	 */
	public String getPingjunxiaofei() {
		return pingjunxiaofei;
	}
				
	
	/**
	 * 设置：机构照片
	 */
	 
	public void setJigouzhaopian(String jigouzhaopian) {
		this.jigouzhaopian = jigouzhaopian;
	}
	
	/**
	 * 获取：机构照片
	 */
	public String getJigouzhaopian() {
		return jigouzhaopian;
	}
				
	
	/**
	 * 设置：机构详情
	 */
	 
	public void setJigouxiangqing(String jigouxiangqing) {
		this.jigouxiangqing = jigouxiangqing;
	}
	
	/**
	 * 获取：机构详情
	 */
	public String getJigouxiangqing() {
		return jigouxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}

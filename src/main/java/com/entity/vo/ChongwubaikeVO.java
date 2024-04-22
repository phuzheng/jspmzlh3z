package com.entity.vo;

import com.entity.ChongwubaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宠物百科
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
public class ChongwubaikeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性格特点
	 */
	
	private String xinggetedian;
		
	/**
	 * 宠物类别
	 */
	
	private String chongwuleibie;
		
	/**
	 * 饲养方式
	 */
	
	private String siyangfangshi;
		
	/**
	 * 宠物简介
	 */
	
	private String chongwujianjie;
		
	/**
	 * 价格金额
	 */
	
	private String jiagejine;
		
	/**
	 * 宠物图片
	 */
	
	private String chongwutupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：性格特点
	 */
	 
	public void setXinggetedian(String xinggetedian) {
		this.xinggetedian = xinggetedian;
	}
	
	/**
	 * 获取：性格特点
	 */
	public String getXinggetedian() {
		return xinggetedian;
	}
				
	
	/**
	 * 设置：宠物类别
	 */
	 
	public void setChongwuleibie(String chongwuleibie) {
		this.chongwuleibie = chongwuleibie;
	}
	
	/**
	 * 获取：宠物类别
	 */
	public String getChongwuleibie() {
		return chongwuleibie;
	}
				
	
	/**
	 * 设置：饲养方式
	 */
	 
	public void setSiyangfangshi(String siyangfangshi) {
		this.siyangfangshi = siyangfangshi;
	}
	
	/**
	 * 获取：饲养方式
	 */
	public String getSiyangfangshi() {
		return siyangfangshi;
	}
				
	
	/**
	 * 设置：宠物简介
	 */
	 
	public void setChongwujianjie(String chongwujianjie) {
		this.chongwujianjie = chongwujianjie;
	}
	
	/**
	 * 获取：宠物简介
	 */
	public String getChongwujianjie() {
		return chongwujianjie;
	}
				
	
	/**
	 * 设置：价格金额
	 */
	 
	public void setJiagejine(String jiagejine) {
		this.jiagejine = jiagejine;
	}
	
	/**
	 * 获取：价格金额
	 */
	public String getJiagejine() {
		return jiagejine;
	}
				
	
	/**
	 * 设置：宠物图片
	 */
	 
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
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

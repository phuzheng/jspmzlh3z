package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物百科
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
@TableName("chongwubaike")
public class ChongwubaikeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwubaikeEntity() {
		
	}
	
	public ChongwubaikeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
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

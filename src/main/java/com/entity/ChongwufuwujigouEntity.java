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
 * 宠物服务机构
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-10 14:28:33
 */
@TableName("chongwufuwujigou")
public class ChongwufuwujigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwufuwujigouEntity() {
		
	}
	
	public ChongwufuwujigouEntity(T t) {
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
	 * 机构名称
	 */
					
	private String jigoumingcheng;
	
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
	 * 设置：机构名称
	 */
	public void setJigoumingcheng(String jigoumingcheng) {
		this.jigoumingcheng = jigoumingcheng;
	}
	/**
	 * 获取：机构名称
	 */
	public String getJigoumingcheng() {
		return jigoumingcheng;
	}
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

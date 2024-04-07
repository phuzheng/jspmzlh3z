package com.entity.vo;

import com.entity.SiliaogoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 饲料购买
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
public class SiliaogoumaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 使用宠物
	 */
	
	private String shiyongchongwu;
		
	/**
	 * 饲料种类
	 */
	
	private String siliaozhonglei;
		
	/**
	 * 品牌商家
	 */
	
	private String pinpaishangjia;
		
	/**
	 * 饲料质量
	 */
	
	private String siliaozhiliang;
		
	/**
	 * 饲料配料
	 */
	
	private String siliaopeiliao;
		
	/**
	 * 饲料图片
	 */
	
	private String siliaotupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：使用宠物
	 */
	 
	public void setShiyongchongwu(String shiyongchongwu) {
		this.shiyongchongwu = shiyongchongwu;
	}
	
	/**
	 * 获取：使用宠物
	 */
	public String getShiyongchongwu() {
		return shiyongchongwu;
	}
				
	
	/**
	 * 设置：饲料种类
	 */
	 
	public void setSiliaozhonglei(String siliaozhonglei) {
		this.siliaozhonglei = siliaozhonglei;
	}
	
	/**
	 * 获取：饲料种类
	 */
	public String getSiliaozhonglei() {
		return siliaozhonglei;
	}
				
	
	/**
	 * 设置：品牌商家
	 */
	 
	public void setPinpaishangjia(String pinpaishangjia) {
		this.pinpaishangjia = pinpaishangjia;
	}
	
	/**
	 * 获取：品牌商家
	 */
	public String getPinpaishangjia() {
		return pinpaishangjia;
	}
				
	
	/**
	 * 设置：饲料质量
	 */
	 
	public void setSiliaozhiliang(String siliaozhiliang) {
		this.siliaozhiliang = siliaozhiliang;
	}
	
	/**
	 * 获取：饲料质量
	 */
	public String getSiliaozhiliang() {
		return siliaozhiliang;
	}
				
	
	/**
	 * 设置：饲料配料
	 */
	 
	public void setSiliaopeiliao(String siliaopeiliao) {
		this.siliaopeiliao = siliaopeiliao;
	}
	
	/**
	 * 获取：饲料配料
	 */
	public String getSiliaopeiliao() {
		return siliaopeiliao;
	}
				
	
	/**
	 * 设置：饲料图片
	 */
	 
	public void setSiliaotupian(String siliaotupian) {
		this.siliaotupian = siliaotupian;
	}
	
	/**
	 * 获取：饲料图片
	 */
	public String getSiliaotupian() {
		return siliaotupian;
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
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}

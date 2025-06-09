package com.entity.model;

import com.entity.MianshiyaoqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 面试邀请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public class MianshiyaoqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 被邀请人姓名
	 */
	
	private String beiyaoqingrenxingming;
		
	/**
	 * 学籍号
	 */
	
	private String xuejihao;
		
	/**
	 * 企业账号
	 */
	
	private String qiyezhanghao;
		
	/**
	 * 面试地点
	 */
	
	private String mianshididian;
		
	/**
	 * 面试时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date mianshishijian;
				
	
	/**
	 * 设置：被邀请人姓名
	 */
	 
	public void setBeiyaoqingrenxingming(String beiyaoqingrenxingming) {
		this.beiyaoqingrenxingming = beiyaoqingrenxingming;
	}
	
	/**
	 * 获取：被邀请人姓名
	 */
	public String getBeiyaoqingrenxingming() {
		return beiyaoqingrenxingming;
	}
				
	
	/**
	 * 设置：学籍号
	 */
	 
	public void setXuejihao(String xuejihao) {
		this.xuejihao = xuejihao;
	}
	
	/**
	 * 获取：学籍号
	 */
	public String getXuejihao() {
		return xuejihao;
	}
				
	
	/**
	 * 设置：企业账号
	 */
	 
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
				
	
	/**
	 * 设置：面试地点
	 */
	 
	public void setMianshididian(String mianshididian) {
		this.mianshididian = mianshididian;
	}
	
	/**
	 * 获取：面试地点
	 */
	public String getMianshididian() {
		return mianshididian;
	}
				
	
	/**
	 * 设置：面试时间
	 */
	 
	public void setMianshishijian(Date mianshishijian) {
		this.mianshishijian = mianshishijian;
	}
	
	/**
	 * 获取：面试时间
	 */
	public Date getMianshishijian() {
		return mianshishijian;
	}
			
}

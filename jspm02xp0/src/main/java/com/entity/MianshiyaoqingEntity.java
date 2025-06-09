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
 * 面试邀请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
@TableName("mianshiyaoqing")
public class MianshiyaoqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MianshiyaoqingEntity() {
		
	}
	
	public MianshiyaoqingEntity(T t) {
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
	 * 是否录用
	 */
					
	private String shifouluyong;
	
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
	 * 设置：是否录用
	 */
	public void setShifouluyong(String shifouluyong) {
		this.shifouluyong = shifouluyong;
	}
	/**
	 * 获取：是否录用
	 */
	public String getShifouluyong() {
		return shifouluyong;
	}
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

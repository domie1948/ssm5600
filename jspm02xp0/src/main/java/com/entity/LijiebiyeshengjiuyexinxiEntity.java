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
 * 历届毕业生就业信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
@TableName("lijiebiyeshengjiuyexinxi")
public class LijiebiyeshengjiuyexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LijiebiyeshengjiuyexinxiEntity() {
		
	}
	
	public LijiebiyeshengjiuyexinxiEntity(T t) {
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
	 * 学院
	 */
					
	private String xueyuan;
	
	/**
	 * 入职单位
	 */
					
	private String ruzhidanwei;
	
	/**
	 * 入职人数
	 */
					
	private Integer ruzhirenshu;
	
	/**
	 * 薪酬
	 */
					
	private Integer xinchou;
	
	/**
	 * 其他待遇
	 */
					
	private String qitadaiyu;
	
	
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
	 * 设置：学院
	 */
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
	/**
	 * 设置：入职单位
	 */
	public void setRuzhidanwei(String ruzhidanwei) {
		this.ruzhidanwei = ruzhidanwei;
	}
	/**
	 * 获取：入职单位
	 */
	public String getRuzhidanwei() {
		return ruzhidanwei;
	}
	/**
	 * 设置：入职人数
	 */
	public void setRuzhirenshu(Integer ruzhirenshu) {
		this.ruzhirenshu = ruzhirenshu;
	}
	/**
	 * 获取：入职人数
	 */
	public Integer getRuzhirenshu() {
		return ruzhirenshu;
	}
	/**
	 * 设置：薪酬
	 */
	public void setXinchou(Integer xinchou) {
		this.xinchou = xinchou;
	}
	/**
	 * 获取：薪酬
	 */
	public Integer getXinchou() {
		return xinchou;
	}
	/**
	 * 设置：其他待遇
	 */
	public void setQitadaiyu(String qitadaiyu) {
		this.qitadaiyu = qitadaiyu;
	}
	/**
	 * 获取：其他待遇
	 */
	public String getQitadaiyu() {
		return qitadaiyu;
	}

}

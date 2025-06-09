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
 * 企业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
@TableName("qiye")
public class QiyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyeEntity() {
		
	}
	
	public QiyeEntity(T t) {
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
	 * 企业账号
	 */
					
	private String qiyezhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 企业地址
	 */
					
	private String qiyedizhi;
	
	/**
	 * 企业规模
	 */
					
	private String qiyeguimo;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 企业图片
	 */
					
	private String qiyetupian;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 企业简介
	 */
					
	private String qiyejianjie;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：企业地址
	 */
	public void setQiyedizhi(String qiyedizhi) {
		this.qiyedizhi = qiyedizhi;
	}
	/**
	 * 获取：企业地址
	 */
	public String getQiyedizhi() {
		return qiyedizhi;
	}
	/**
	 * 设置：企业规模
	 */
	public void setQiyeguimo(String qiyeguimo) {
		this.qiyeguimo = qiyeguimo;
	}
	/**
	 * 获取：企业规模
	 */
	public String getQiyeguimo() {
		return qiyeguimo;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：企业图片
	 */
	public void setQiyetupian(String qiyetupian) {
		this.qiyetupian = qiyetupian;
	}
	/**
	 * 获取：企业图片
	 */
	public String getQiyetupian() {
		return qiyetupian;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：企业简介
	 */
	public void setQiyejianjie(String qiyejianjie) {
		this.qiyejianjie = qiyejianjie;
	}
	/**
	 * 获取：企业简介
	 */
	public String getQiyejianjie() {
		return qiyejianjie;
	}

}

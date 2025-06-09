package com.entity.vo;

import com.entity.ToudidejianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 投递的简历
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public class ToudidejianliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 求职岗位
	 */
	
	private String qiuzhigangwei;
		
	/**
	 * 工作地点
	 */
	
	private String gongzuodidian;
		
	/**
	 * 期望薪资
	 */
	
	private Integer qiwangxinzi;
		
	/**
	 * 教育背景
	 */
	
	private String jiaoyubeijing;
		
	/**
	 * 获奖证书
	 */
	
	private String huojiangzhengshu;
		
	/**
	 * 毕业学校
	 */
	
	private String biyexuexiao;
		
	/**
	 * 详细内容
	 */
	
	private String xiangxineirong;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：求职岗位
	 */
	 
	public void setQiuzhigangwei(String qiuzhigangwei) {
		this.qiuzhigangwei = qiuzhigangwei;
	}
	
	/**
	 * 获取：求职岗位
	 */
	public String getQiuzhigangwei() {
		return qiuzhigangwei;
	}
				
	
	/**
	 * 设置：工作地点
	 */
	 
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
				
	
	/**
	 * 设置：期望薪资
	 */
	 
	public void setQiwangxinzi(Integer qiwangxinzi) {
		this.qiwangxinzi = qiwangxinzi;
	}
	
	/**
	 * 获取：期望薪资
	 */
	public Integer getQiwangxinzi() {
		return qiwangxinzi;
	}
				
	
	/**
	 * 设置：教育背景
	 */
	 
	public void setJiaoyubeijing(String jiaoyubeijing) {
		this.jiaoyubeijing = jiaoyubeijing;
	}
	
	/**
	 * 获取：教育背景
	 */
	public String getJiaoyubeijing() {
		return jiaoyubeijing;
	}
				
	
	/**
	 * 设置：获奖证书
	 */
	 
	public void setHuojiangzhengshu(String huojiangzhengshu) {
		this.huojiangzhengshu = huojiangzhengshu;
	}
	
	/**
	 * 获取：获奖证书
	 */
	public String getHuojiangzhengshu() {
		return huojiangzhengshu;
	}
				
	
	/**
	 * 设置：毕业学校
	 */
	 
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
	}
				
	
	/**
	 * 设置：详细内容
	 */
	 
	public void setXiangxineirong(String xiangxineirong) {
		this.xiangxineirong = xiangxineirong;
	}
	
	/**
	 * 获取：详细内容
	 */
	public String getXiangxineirong() {
		return xiangxineirong;
	}
			
}

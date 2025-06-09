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
 * 学分信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
@TableName("xuefenxinxi")
public class XuefenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuefenxinxiEntity() {
		
	}
	
	public XuefenxinxiEntity(T t) {
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
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 必修课学分
	 */
					
	private Float bixiukexuefen;
	
	/**
	 * 选修课学分
	 */
					
	private Float xuanxiukexuefen;
	
	/**
	 * 加分项目名称
	 */
					
	private String jiafenxiangmumingcheng;
	
	/**
	 * 所加学分
	 */
					
	private Float suojiaxuefen;
	
	/**
	 * 总学分
	 */
					
	private String zongxuefen;
	
	/**
	 * 毕业状态
	 */
					
	private String biyezhuangtai;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 评语
	 */
					
	private String pingyu;
	
	
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
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
	 * 设置：必修课学分
	 */
	public void setBixiukexuefen(Float bixiukexuefen) {
		this.bixiukexuefen = bixiukexuefen;
	}
	/**
	 * 获取：必修课学分
	 */
	public Float getBixiukexuefen() {
		return bixiukexuefen;
	}
	/**
	 * 设置：选修课学分
	 */
	public void setXuanxiukexuefen(Float xuanxiukexuefen) {
		this.xuanxiukexuefen = xuanxiukexuefen;
	}
	/**
	 * 获取：选修课学分
	 */
	public Float getXuanxiukexuefen() {
		return xuanxiukexuefen;
	}
	/**
	 * 设置：加分项目名称
	 */
	public void setJiafenxiangmumingcheng(String jiafenxiangmumingcheng) {
		this.jiafenxiangmumingcheng = jiafenxiangmumingcheng;
	}
	/**
	 * 获取：加分项目名称
	 */
	public String getJiafenxiangmumingcheng() {
		return jiafenxiangmumingcheng;
	}
	/**
	 * 设置：所加学分
	 */
	public void setSuojiaxuefen(Float suojiaxuefen) {
		this.suojiaxuefen = suojiaxuefen;
	}
	/**
	 * 获取：所加学分
	 */
	public Float getSuojiaxuefen() {
		return suojiaxuefen;
	}
	/**
	 * 设置：总学分
	 */
	public void setZongxuefen(String zongxuefen) {
		this.zongxuefen = zongxuefen;
	}
	/**
	 * 获取：总学分
	 */
	public String getZongxuefen() {
		return zongxuefen;
	}
	/**
	 * 设置：毕业状态
	 */
	public void setBiyezhuangtai(String biyezhuangtai) {
		this.biyezhuangtai = biyezhuangtai;
	}
	/**
	 * 获取：毕业状态
	 */
	public String getBiyezhuangtai() {
		return biyezhuangtai;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
	/**
	 * 设置：评语
	 */
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}

}

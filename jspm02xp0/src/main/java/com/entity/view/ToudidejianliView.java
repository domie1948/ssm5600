package com.entity.view;

import com.entity.ToudidejianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投递的简历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
@TableName("toudidejianli")
public class ToudidejianliView  extends ToudidejianliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToudidejianliView(){
	}
 
 	public ToudidejianliView(ToudidejianliEntity toudidejianliEntity){
 	try {
			BeanUtils.copyProperties(this, toudidejianliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

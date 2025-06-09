package com.entity.view;

import com.entity.JiuyedaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 就业导师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
@TableName("jiuyedaoshi")
public class JiuyedaoshiView  extends JiuyedaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuyedaoshiView(){
	}
 
 	public JiuyedaoshiView(JiuyedaoshiEntity jiuyedaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiuyedaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

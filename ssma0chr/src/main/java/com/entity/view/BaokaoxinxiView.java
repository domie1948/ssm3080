package com.entity.view;

import com.entity.BaokaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报考信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
@TableName("baokaoxinxi")
public class BaokaoxinxiView  extends BaokaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaokaoxinxiView(){
	}
 
 	public BaokaoxinxiView(BaokaoxinxiEntity baokaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baokaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

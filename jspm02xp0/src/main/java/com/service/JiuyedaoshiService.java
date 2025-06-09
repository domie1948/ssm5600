package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyedaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyedaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyedaoshiView;


/**
 * 就业导师
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface JiuyedaoshiService extends IService<JiuyedaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyedaoshiVO> selectListVO(Wrapper<JiuyedaoshiEntity> wrapper);
   	
   	JiuyedaoshiVO selectVO(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
   	
   	List<JiuyedaoshiView> selectListView(Wrapper<JiuyedaoshiEntity> wrapper);
   	
   	JiuyedaoshiView selectView(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyedaoshiEntity> wrapper);
   	
}


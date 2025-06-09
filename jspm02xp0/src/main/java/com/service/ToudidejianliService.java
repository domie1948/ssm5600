package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToudidejianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToudidejianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToudidejianliView;


/**
 * 投递的简历
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface ToudidejianliService extends IService<ToudidejianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToudidejianliVO> selectListVO(Wrapper<ToudidejianliEntity> wrapper);
   	
   	ToudidejianliVO selectVO(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
   	
   	List<ToudidejianliView> selectListView(Wrapper<ToudidejianliEntity> wrapper);
   	
   	ToudidejianliView selectView(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToudidejianliEntity> wrapper);
   	
}


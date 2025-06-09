package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LijiebiyeshengjiuyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LijiebiyeshengjiuyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LijiebiyeshengjiuyexinxiView;


/**
 * 历届毕业生就业信息
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface LijiebiyeshengjiuyexinxiService extends IService<LijiebiyeshengjiuyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LijiebiyeshengjiuyexinxiVO> selectListVO(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
   	
   	LijiebiyeshengjiuyexinxiVO selectVO(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
   	
   	List<LijiebiyeshengjiuyexinxiView> selectListView(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
   	
   	LijiebiyeshengjiuyexinxiView selectView(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
   	
}


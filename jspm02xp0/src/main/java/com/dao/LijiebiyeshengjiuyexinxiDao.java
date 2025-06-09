package com.dao;

import com.entity.LijiebiyeshengjiuyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LijiebiyeshengjiuyexinxiVO;
import com.entity.view.LijiebiyeshengjiuyexinxiView;


/**
 * 历届毕业生就业信息
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface LijiebiyeshengjiuyexinxiDao extends BaseMapper<LijiebiyeshengjiuyexinxiEntity> {
	
	List<LijiebiyeshengjiuyexinxiVO> selectListVO(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
	
	LijiebiyeshengjiuyexinxiVO selectVO(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
	
	List<LijiebiyeshengjiuyexinxiView> selectListView(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);

	List<LijiebiyeshengjiuyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
	
	LijiebiyeshengjiuyexinxiView selectView(@Param("ew") Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper);
	
}

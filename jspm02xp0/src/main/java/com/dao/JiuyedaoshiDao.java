package com.dao;

import com.entity.JiuyedaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuyedaoshiVO;
import com.entity.view.JiuyedaoshiView;


/**
 * 就业导师
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface JiuyedaoshiDao extends BaseMapper<JiuyedaoshiEntity> {
	
	List<JiuyedaoshiVO> selectListVO(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
	
	JiuyedaoshiVO selectVO(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
	
	List<JiuyedaoshiView> selectListView(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);

	List<JiuyedaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
	
	JiuyedaoshiView selectView(@Param("ew") Wrapper<JiuyedaoshiEntity> wrapper);
	
}

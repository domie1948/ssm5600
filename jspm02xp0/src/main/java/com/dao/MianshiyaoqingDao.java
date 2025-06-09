package com.dao;

import com.entity.MianshiyaoqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshiyaoqingVO;
import com.entity.view.MianshiyaoqingView;


/**
 * 面试邀请
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface MianshiyaoqingDao extends BaseMapper<MianshiyaoqingEntity> {
	
	List<MianshiyaoqingVO> selectListVO(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
	
	MianshiyaoqingVO selectVO(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
	
	List<MianshiyaoqingView> selectListView(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);

	List<MianshiyaoqingView> selectListView(Pagination page,@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
	
	MianshiyaoqingView selectView(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
	
}

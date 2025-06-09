package com.dao;

import com.entity.ToudidejianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToudidejianliVO;
import com.entity.view.ToudidejianliView;


/**
 * 投递的简历
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public interface ToudidejianliDao extends BaseMapper<ToudidejianliEntity> {
	
	List<ToudidejianliVO> selectListVO(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
	
	ToudidejianliVO selectVO(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
	
	List<ToudidejianliView> selectListView(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);

	List<ToudidejianliView> selectListView(Pagination page,@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
	
	ToudidejianliView selectView(@Param("ew") Wrapper<ToudidejianliEntity> wrapper);
	
}

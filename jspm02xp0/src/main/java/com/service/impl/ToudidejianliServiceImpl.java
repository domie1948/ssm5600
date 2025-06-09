package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ToudidejianliDao;
import com.entity.ToudidejianliEntity;
import com.service.ToudidejianliService;
import com.entity.vo.ToudidejianliVO;
import com.entity.view.ToudidejianliView;

@Service("toudidejianliService")
public class ToudidejianliServiceImpl extends ServiceImpl<ToudidejianliDao, ToudidejianliEntity> implements ToudidejianliService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToudidejianliEntity> page = this.selectPage(
                new Query<ToudidejianliEntity>(params).getPage(),
                new EntityWrapper<ToudidejianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToudidejianliEntity> wrapper) {
		  Page<ToudidejianliView> page =new Query<ToudidejianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ToudidejianliVO> selectListVO(Wrapper<ToudidejianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToudidejianliVO selectVO(Wrapper<ToudidejianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToudidejianliView> selectListView(Wrapper<ToudidejianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToudidejianliView selectView(Wrapper<ToudidejianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

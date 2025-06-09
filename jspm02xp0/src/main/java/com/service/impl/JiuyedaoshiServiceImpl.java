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


import com.dao.JiuyedaoshiDao;
import com.entity.JiuyedaoshiEntity;
import com.service.JiuyedaoshiService;
import com.entity.vo.JiuyedaoshiVO;
import com.entity.view.JiuyedaoshiView;

@Service("jiuyedaoshiService")
public class JiuyedaoshiServiceImpl extends ServiceImpl<JiuyedaoshiDao, JiuyedaoshiEntity> implements JiuyedaoshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuyedaoshiEntity> page = this.selectPage(
                new Query<JiuyedaoshiEntity>(params).getPage(),
                new EntityWrapper<JiuyedaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuyedaoshiEntity> wrapper) {
		  Page<JiuyedaoshiView> page =new Query<JiuyedaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuyedaoshiVO> selectListVO(Wrapper<JiuyedaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuyedaoshiVO selectVO(Wrapper<JiuyedaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuyedaoshiView> selectListView(Wrapper<JiuyedaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuyedaoshiView selectView(Wrapper<JiuyedaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

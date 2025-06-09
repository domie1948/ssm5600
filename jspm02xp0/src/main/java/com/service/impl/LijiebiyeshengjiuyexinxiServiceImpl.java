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


import com.dao.LijiebiyeshengjiuyexinxiDao;
import com.entity.LijiebiyeshengjiuyexinxiEntity;
import com.service.LijiebiyeshengjiuyexinxiService;
import com.entity.vo.LijiebiyeshengjiuyexinxiVO;
import com.entity.view.LijiebiyeshengjiuyexinxiView;

@Service("lijiebiyeshengjiuyexinxiService")
public class LijiebiyeshengjiuyexinxiServiceImpl extends ServiceImpl<LijiebiyeshengjiuyexinxiDao, LijiebiyeshengjiuyexinxiEntity> implements LijiebiyeshengjiuyexinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LijiebiyeshengjiuyexinxiEntity> page = this.selectPage(
                new Query<LijiebiyeshengjiuyexinxiEntity>(params).getPage(),
                new EntityWrapper<LijiebiyeshengjiuyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper) {
		  Page<LijiebiyeshengjiuyexinxiView> page =new Query<LijiebiyeshengjiuyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LijiebiyeshengjiuyexinxiVO> selectListVO(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LijiebiyeshengjiuyexinxiVO selectVO(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LijiebiyeshengjiuyexinxiView> selectListView(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LijiebiyeshengjiuyexinxiView selectView(Wrapper<LijiebiyeshengjiuyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

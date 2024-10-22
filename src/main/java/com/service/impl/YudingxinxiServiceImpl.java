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


import com.dao.YudingxinxiDao;
import com.entity.YudingxinxiEntity;
import com.service.YudingxinxiService;
import com.entity.vo.YudingxinxiVO;
import com.entity.view.YudingxinxiView;

@Service("yudingxinxiService")
public class YudingxinxiServiceImpl extends ServiceImpl<YudingxinxiDao, YudingxinxiEntity> implements YudingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YudingxinxiEntity> page = this.selectPage(
                new Query<YudingxinxiEntity>(params).getPage(),
                new EntityWrapper<YudingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YudingxinxiEntity> wrapper) {
		  Page<YudingxinxiView> page =new Query<YudingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YudingxinxiVO> selectListVO(Wrapper<YudingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YudingxinxiVO selectVO(Wrapper<YudingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YudingxinxiView> selectListView(Wrapper<YudingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YudingxinxiView selectView(Wrapper<YudingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

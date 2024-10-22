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


import com.dao.XianlutuijianDao;
import com.entity.XianlutuijianEntity;
import com.service.XianlutuijianService;
import com.entity.vo.XianlutuijianVO;
import com.entity.view.XianlutuijianView;

@Service("xianlutuijianService")
public class XianlutuijianServiceImpl extends ServiceImpl<XianlutuijianDao, XianlutuijianEntity> implements XianlutuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianlutuijianEntity> page = this.selectPage(
                new Query<XianlutuijianEntity>(params).getPage(),
                new EntityWrapper<XianlutuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianlutuijianEntity> wrapper) {
		  Page<XianlutuijianView> page =new Query<XianlutuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianlutuijianVO> selectListVO(Wrapper<XianlutuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianlutuijianVO selectVO(Wrapper<XianlutuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianlutuijianView> selectListView(Wrapper<XianlutuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianlutuijianView selectView(Wrapper<XianlutuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

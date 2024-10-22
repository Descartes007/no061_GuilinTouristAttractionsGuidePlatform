package com.dao;

import com.entity.YudingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YudingxinxiVO;
import com.entity.view.YudingxinxiView;


/**
 * 预订信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface YudingxinxiDao extends BaseMapper<YudingxinxiEntity> {
	
	List<YudingxinxiVO> selectListVO(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
	
	YudingxinxiVO selectVO(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
	
	List<YudingxinxiView> selectListView(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);

	List<YudingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
	
	YudingxinxiView selectView(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
	
}

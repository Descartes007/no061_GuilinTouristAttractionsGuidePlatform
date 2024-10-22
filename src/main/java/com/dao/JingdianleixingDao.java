package com.dao;

import com.entity.JingdianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianleixingVO;
import com.entity.view.JingdianleixingView;


/**
 * 景点类型
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface JingdianleixingDao extends BaseMapper<JingdianleixingEntity> {
	
	List<JingdianleixingVO> selectListVO(@Param("ew") Wrapper<JingdianleixingEntity> wrapper);
	
	JingdianleixingVO selectVO(@Param("ew") Wrapper<JingdianleixingEntity> wrapper);
	
	List<JingdianleixingView> selectListView(@Param("ew") Wrapper<JingdianleixingEntity> wrapper);

	List<JingdianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianleixingEntity> wrapper);
	
	JingdianleixingView selectView(@Param("ew") Wrapper<JingdianleixingEntity> wrapper);
	
}

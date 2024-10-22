package com.dao;

import com.entity.XianlutuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianlutuijianVO;
import com.entity.view.XianlutuijianView;


/**
 * 线路推荐
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface XianlutuijianDao extends BaseMapper<XianlutuijianEntity> {
	
	List<XianlutuijianVO> selectListVO(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
	
	XianlutuijianVO selectVO(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
	
	List<XianlutuijianView> selectListView(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);

	List<XianlutuijianView> selectListView(Pagination page,@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
	
	XianlutuijianView selectView(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
	
}

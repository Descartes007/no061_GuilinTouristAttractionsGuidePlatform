package com.dao;

import com.entity.DiscussxianlutuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianlutuijianVO;
import com.entity.view.DiscussxianlutuijianView;


/**
 * 线路推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface DiscussxianlutuijianDao extends BaseMapper<DiscussxianlutuijianEntity> {
	
	List<DiscussxianlutuijianVO> selectListVO(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
	
	DiscussxianlutuijianVO selectVO(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
	
	List<DiscussxianlutuijianView> selectListView(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);

	List<DiscussxianlutuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
	
	DiscussxianlutuijianView selectView(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
	
}

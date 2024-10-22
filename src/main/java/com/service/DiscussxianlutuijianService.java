package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianlutuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianlutuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianlutuijianView;


/**
 * 线路推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface DiscussxianlutuijianService extends IService<DiscussxianlutuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianlutuijianVO> selectListVO(Wrapper<DiscussxianlutuijianEntity> wrapper);
   	
   	DiscussxianlutuijianVO selectVO(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
   	
   	List<DiscussxianlutuijianView> selectListView(Wrapper<DiscussxianlutuijianEntity> wrapper);
   	
   	DiscussxianlutuijianView selectView(@Param("ew") Wrapper<DiscussxianlutuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianlutuijianEntity> wrapper);
   	
}


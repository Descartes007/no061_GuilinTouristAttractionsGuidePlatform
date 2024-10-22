package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YudingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YudingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YudingxinxiView;


/**
 * 预订信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface YudingxinxiService extends IService<YudingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YudingxinxiVO> selectListVO(Wrapper<YudingxinxiEntity> wrapper);
   	
   	YudingxinxiVO selectVO(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
   	
   	List<YudingxinxiView> selectListView(Wrapper<YudingxinxiEntity> wrapper);
   	
   	YudingxinxiView selectView(@Param("ew") Wrapper<YudingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YudingxinxiEntity> wrapper);
   	
}


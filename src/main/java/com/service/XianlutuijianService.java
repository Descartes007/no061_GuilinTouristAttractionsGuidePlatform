package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianlutuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianlutuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianlutuijianView;


/**
 * 线路推荐
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:07:49
 */
public interface XianlutuijianService extends IService<XianlutuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianlutuijianVO> selectListVO(Wrapper<XianlutuijianEntity> wrapper);
   	
   	XianlutuijianVO selectVO(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
   	
   	List<XianlutuijianView> selectListView(Wrapper<XianlutuijianEntity> wrapper);
   	
   	XianlutuijianView selectView(@Param("ew") Wrapper<XianlutuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianlutuijianEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaokaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaokaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaokaoxinxiView;


/**
 * 报考信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
public interface BaokaoxinxiService extends IService<BaokaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaokaoxinxiVO> selectListVO(Wrapper<BaokaoxinxiEntity> wrapper);
   	
   	BaokaoxinxiVO selectVO(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
   	
   	List<BaokaoxinxiView> selectListView(Wrapper<BaokaoxinxiEntity> wrapper);
   	
   	BaokaoxinxiView selectView(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaokaoxinxiEntity> wrapper);
   	
}


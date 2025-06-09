package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuojiangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuojiangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuojiangxinxiView;


/**
 * 获奖信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
public interface HuojiangxinxiService extends IService<HuojiangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuojiangxinxiVO> selectListVO(Wrapper<HuojiangxinxiEntity> wrapper);
   	
   	HuojiangxinxiVO selectVO(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
   	
   	List<HuojiangxinxiView> selectListView(Wrapper<HuojiangxinxiEntity> wrapper);
   	
   	HuojiangxinxiView selectView(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuojiangxinxiEntity> wrapper);
   	
}


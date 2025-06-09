package com.dao;

import com.entity.HuojiangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuojiangxinxiVO;
import com.entity.view.HuojiangxinxiView;


/**
 * 获奖信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
public interface HuojiangxinxiDao extends BaseMapper<HuojiangxinxiEntity> {
	
	List<HuojiangxinxiVO> selectListVO(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
	
	HuojiangxinxiVO selectVO(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
	
	List<HuojiangxinxiView> selectListView(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);

	List<HuojiangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
	
	HuojiangxinxiView selectView(@Param("ew") Wrapper<HuojiangxinxiEntity> wrapper);
	
}

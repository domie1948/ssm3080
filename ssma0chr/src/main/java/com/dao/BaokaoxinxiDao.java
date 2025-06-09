package com.dao;

import com.entity.BaokaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaokaoxinxiVO;
import com.entity.view.BaokaoxinxiView;


/**
 * 报考信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:29:12
 */
public interface BaokaoxinxiDao extends BaseMapper<BaokaoxinxiEntity> {
	
	List<BaokaoxinxiVO> selectListVO(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
	
	BaokaoxinxiVO selectVO(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
	
	List<BaokaoxinxiView> selectListView(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);

	List<BaokaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
	
	BaokaoxinxiView selectView(@Param("ew") Wrapper<BaokaoxinxiEntity> wrapper);
	
}

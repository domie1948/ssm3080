package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaokaoxinxiDao;
import com.entity.BaokaoxinxiEntity;
import com.service.BaokaoxinxiService;
import com.entity.vo.BaokaoxinxiVO;
import com.entity.view.BaokaoxinxiView;

@Service("baokaoxinxiService")
public class BaokaoxinxiServiceImpl extends ServiceImpl<BaokaoxinxiDao, BaokaoxinxiEntity> implements BaokaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaokaoxinxiEntity> page = this.selectPage(
                new Query<BaokaoxinxiEntity>(params).getPage(),
                new EntityWrapper<BaokaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaokaoxinxiEntity> wrapper) {
		  Page<BaokaoxinxiView> page =new Query<BaokaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaokaoxinxiVO> selectListVO(Wrapper<BaokaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaokaoxinxiVO selectVO(Wrapper<BaokaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaokaoxinxiView> selectListView(Wrapper<BaokaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaokaoxinxiView selectView(Wrapper<BaokaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

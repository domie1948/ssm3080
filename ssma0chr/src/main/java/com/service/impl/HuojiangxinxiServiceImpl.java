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


import com.dao.HuojiangxinxiDao;
import com.entity.HuojiangxinxiEntity;
import com.service.HuojiangxinxiService;
import com.entity.vo.HuojiangxinxiVO;
import com.entity.view.HuojiangxinxiView;

@Service("huojiangxinxiService")
public class HuojiangxinxiServiceImpl extends ServiceImpl<HuojiangxinxiDao, HuojiangxinxiEntity> implements HuojiangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuojiangxinxiEntity> page = this.selectPage(
                new Query<HuojiangxinxiEntity>(params).getPage(),
                new EntityWrapper<HuojiangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuojiangxinxiEntity> wrapper) {
		  Page<HuojiangxinxiView> page =new Query<HuojiangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuojiangxinxiVO> selectListVO(Wrapper<HuojiangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuojiangxinxiVO selectVO(Wrapper<HuojiangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuojiangxinxiView> selectListView(Wrapper<HuojiangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuojiangxinxiView selectView(Wrapper<HuojiangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

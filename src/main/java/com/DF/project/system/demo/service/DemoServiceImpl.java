package com.DF.project.system.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DF.project.system.demo.mapper.DemoMapper;
import com.DF.project.system.demo.domain.Demo;
import com.DF.project.system.demo.service.IDemoService;
import com.DF.common.utils.text.Convert;

/**
 * 565473467 服务层实现
 * 
 * @author DF
 * @date 2019-08-07
 */
@Service
public class DemoServiceImpl implements IDemoService 
{
	@Autowired
	private DemoMapper demoMapper;

	/**
     * 查询565473467信息
     * 
     * @param id 565473467ID
     * @return 565473467信息
     */
    @Override
	public Demo selectDemoById(Integer id)
	{
	    return demoMapper.selectDemoById(id);
	}
	
	/**
     * 查询565473467列表
     * 
     * @param demo 565473467信息
     * @return 565473467集合
     */
	@Override
	public List<Demo> selectDemoList(Demo demo)
	{
	    return demoMapper.selectDemoList(demo);
	}
	
    /**
     * 新增565473467
     * 
     * @param demo 565473467信息
     * @return 结果
     */
	@Override
	public int insertDemo(Demo demo)
	{
	    return demoMapper.insertDemo(demo);
	}
	
	/**
     * 修改565473467
     * 
     * @param demo 565473467信息
     * @return 结果
     */
	@Override
	public int updateDemo(Demo demo)
	{
	    return demoMapper.updateDemo(demo);
	}

	/**
     * 删除565473467对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDemoByIds(String ids)
	{
		return demoMapper.deleteDemoByIds(Convert.toStrArray(ids));
	}
	
}

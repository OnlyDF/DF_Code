package com.DF.project.system.demo.mapper;

import com.DF.project.system.demo.domain.Demo;
import java.util.List;	

/**
 * 565473467 数据层
 * 
 * @author DF
 * @date 2019-08-07
 */
public interface DemoMapper 
{
	/**
     * 查询565473467信息
     * 
     * @param id 565473467ID
     * @return 565473467信息
     */
	public Demo selectDemoById(Integer id);
	
	/**
     * 查询565473467列表
     * 
     * @param demo 565473467信息
     * @return 565473467集合
     */
	public List<Demo> selectDemoList(Demo demo);
	
	/**
     * 新增565473467
     * 
     * @param demo 565473467信息
     * @return 结果
     */
	public int insertDemo(Demo demo);
	
	/**
     * 修改565473467
     * 
     * @param demo 565473467信息
     * @return 结果
     */
	public int updateDemo(Demo demo);
	
	/**
     * 删除565473467
     * 
     * @param id 565473467ID
     * @return 结果
     */
	public int deleteDemoById(Integer id);
	
	/**
     * 批量删除565473467
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDemoByIds(String[] ids);
	
}
package com.DF.project.system.demo.controller;

import com.DF.common.utils.poi.ExcelUtil;
import com.DF.framework.aspectj.lang.annotation.Log;
import com.DF.framework.aspectj.lang.enums.BusinessType;
import com.DF.framework.web.controller.BaseController;
import com.DF.framework.web.domain.AjaxResult;
import com.DF.framework.web.page.TableDataInfo;
import com.DF.project.system.demo.domain.Demo;
import com.DF.project.system.demo.service.IDemoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 565473467信息操作处理
 * 
 * @author DF
 * @date 2019-08-07
 */
@Controller
@RequestMapping("/system/demo")
public class DemoController extends BaseController
{
    private String prefix = "system/demo";
	
	@Autowired
	private IDemoService demoService;
	
	@RequiresPermissions("system:demo:view")
	@GetMapping()
	public String demo()
	{
	    return prefix + "/demo";
	}
	
	/**
	 * 查询565473467列表
	 */
	@RequiresPermissions("system:demo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Demo demo)
	{
		startPage();
        List<Demo> list = demoService.selectDemoList(demo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出565473467列表
	 */
	@RequiresPermissions("system:demo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Demo demo)
    {
    	List<Demo> list = demoService.selectDemoList(demo);
        ExcelUtil<Demo> util = new ExcelUtil<Demo>(Demo.class);
        return util.exportExcel(list, "demo");
    }
	
	/**
	 * 新增565473467
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存565473467
	 */
	@RequiresPermissions("system:demo:add")
	@Log(title = "565473467", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Demo demo)
	{		
		return toAjax(demoService.insertDemo(demo));
	}

	/**
	 * 修改565473467
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Demo demo = demoService.selectDemoById(id);
		mmap.put("demo", demo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存565473467
	 */
	@RequiresPermissions("system:demo:edit")
	@Log(title = "565473467", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Demo demo)
	{		
		return toAjax(demoService.updateDemo(demo));
	}
	
	/**
	 * 删除565473467
	 */
	@RequiresPermissions("system:demo:remove")
	@Log(title = "565473467", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(demoService.deleteDemoByIds(ids));
	}
	
}

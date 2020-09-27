package com.huiyi.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huiyi.common.core.domain.R;
import com.huiyi.common.core.controller.BaseController;
import com.huiyi.biz.domain.WelfareProject;
import com.huiyi.biz.service.IWelfareProjectService;

/**
 * 项目 提供者
 * 
 * @author huiyi
 * @date 2020-05-04
 */
@RestController
@RequestMapping("welfare/welfareProject")
public class WelfareProjectController extends BaseController
{
	
	@Autowired
	private IWelfareProjectService welfareProjectService;
	
	/**
	 * 查询${tableComment}
	 */
	@GetMapping("get/{id}")
	public WelfareProject get(@PathVariable("id") Long id)
	{
		return welfareProjectService.selectWelfareProjectById(id);
		
	}
	
	/**
	 * 查询项目列表
	 */
	@GetMapping("list")
	public R list(WelfareProject welfareProject)
	{
		startPage();
        return result(welfareProjectService.selectWelfareProjectList(welfareProject));
	}
	
	
	/**
	 * 新增保存项目
	 */
	@PostMapping("save")
	public R addSave(@RequestBody WelfareProject welfareProject)
	{		
		return toAjax(welfareProjectService.insertWelfareProject(welfareProject));
	}

	/**
	 * 修改保存项目
	 */
	@PostMapping("update")
	public R editSave(@RequestBody WelfareProject welfareProject)
	{		
		return toAjax(welfareProjectService.updateWelfareProject(welfareProject));
	}
	
	/**
	 * 删除${tableComment}
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{		
		return toAjax(welfareProjectService.deleteWelfareProjectByIds(ids));
	}
	
}

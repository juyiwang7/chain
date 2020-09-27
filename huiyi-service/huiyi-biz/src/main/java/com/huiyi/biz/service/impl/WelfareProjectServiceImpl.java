package com.huiyi.biz.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.huiyi.biz.mapper.WelfareProjectMapper;
import com.huiyi.biz.domain.WelfareProject;
import com.huiyi.biz.service.IWelfareProjectService;
import com.huiyi.common.core.text.Convert;

/**
 * 项目Service业务层处理
 * 
 * @author huiyi
 * @date 2020-05-04
 */
@Service
public class WelfareProjectServiceImpl implements IWelfareProjectService 
{
    @Autowired
    private WelfareProjectMapper welfareProjectMapper;

    /**
     * 查询项目
     * 
     * @param id 项目ID
     * @return 项目
     */
    @Override
    public WelfareProject selectWelfareProjectById(Long id)
    {
        return welfareProjectMapper.selectWelfareProjectById(id);
    }

    /**
     * 查询项目列表
     * 
     * @param welfareProject 项目
     * @return 项目
     */
    @Override
    public List<WelfareProject> selectWelfareProjectList(WelfareProject welfareProject)
    {
        return welfareProjectMapper.selectWelfareProjectList(welfareProject);
    }

    /**
     * 新增项目
     * 
     * @param welfareProject 项目
     * @return 结果
     */
    @Override
    public int insertWelfareProject(WelfareProject welfareProject)
    {
        return welfareProjectMapper.insertWelfareProject(welfareProject);
    }

    /**
     * 修改项目
     * 
     * @param welfareProject 项目
     * @return 结果
     */
    @Override
    public int updateWelfareProject(WelfareProject welfareProject)
    {
        return welfareProjectMapper.updateWelfareProject(welfareProject);
    }

    /**
     * 删除项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWelfareProjectByIds(String ids)
    {
        return welfareProjectMapper.deleteWelfareProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目信息
     * 
     * @param id 项目ID
     * @return 结果
     */
    @Override
    public int deleteWelfareProjectById(Long id)
    {
        return welfareProjectMapper.deleteWelfareProjectById(id);
    }
}

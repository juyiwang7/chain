package com.huiyi.biz.mapper;

import com.huiyi.biz.domain.WelfareProject;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 项目Mapper接口
 * 
 * @author huiyi
 * @date 2020-05-04
 */
public interface WelfareProjectMapper extends Mapper<WelfareProject>
{
    /**
     * 查询项目
     * 
     * @param id 项目ID
     * @return 项目
     */
    public WelfareProject selectWelfareProjectById(Long id);

    /**
     * 查询项目列表
     * 
     * @param welfareProject 项目
     * @return 项目集合
     */
    public List<WelfareProject> selectWelfareProjectList(WelfareProject welfareProject);

    /**
     * 新增项目
     * 
     * @param welfareProject 项目
     * @return 结果
     */
    public int insertWelfareProject(WelfareProject welfareProject);

    /**
     * 修改项目
     * 
     * @param welfareProject 项目
     * @return 结果
     */
    public int updateWelfareProject(WelfareProject welfareProject);

    /**
     * 删除项目
     * 
     * @param id 项目ID
     * @return 结果
     */
    public int deleteWelfareProjectById(Long id);

    /**
     * 批量删除项目
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWelfareProjectByIds(String[] ids);
}

package com.huiyi.biz.domain;

import com.huiyi.common.annotation.Excel;
import com.huiyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 项目对象 welfare_project
 * 
 * @author huiyi
 * @date 2020-05-04
 */
public class WelfareProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 项目分类 */
    @Excel(name = "项目分类")
    private String type;

    /** 地点 */
    @Excel(name = "地点")
    private String location;

    /** 时间 */
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date period;

    /** 项目负责人 */
    @Excel(name = "项目负责人")
    private String manager;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 项目介绍 */
    @Excel(name = "项目介绍")
    private String description;

    /** 项目状态 */
    @Excel(name = "项目状态")
    private Integer status;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gmtCreate;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gmtModified;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 逻辑删除标记 */
    @Excel(name = "逻辑删除标记")
    private Integer isDelete;

    /** 项目目标外键ID */
    @Excel(name = "项目目标外键ID")
    private Long ptId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setPeriod(Date period) 
    {
        this.period = period;
    }

    public Date getPeriod() 
    {
        return period;
    }
    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setGmtCreate(Date gmtCreate) 
    {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtCreate() 
    {
        return gmtCreate;
    }
    public void setGmtModified(Date gmtModified) 
    {
        this.gmtModified = gmtModified;
    }

    public Date getGmtModified() 
    {
        return gmtModified;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setPtId(Long ptId) 
    {
        this.ptId = ptId;
    }

    public Long getPtId() 
    {
        return ptId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("location", getLocation())
            .append("period", getPeriod())
            .append("manager", getManager())
            .append("phone", getPhone())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("gmtCreate", getGmtCreate())
            .append("gmtModified", getGmtModified())
            .append("operator", getOperator())
            .append("isDelete", getIsDelete())
            .append("ptId", getPtId())
            .toString();
    }
}

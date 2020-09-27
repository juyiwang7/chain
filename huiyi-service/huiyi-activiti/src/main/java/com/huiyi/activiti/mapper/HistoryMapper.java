package com.huiyi.activiti.mapper;

import java.util.List;

import com.huiyi.activiti.vo.HiProcInsVo;

public interface HistoryMapper
{
    List<HiProcInsVo> getHiProcInsListDone(HiProcInsVo hiProcInsVo);
}
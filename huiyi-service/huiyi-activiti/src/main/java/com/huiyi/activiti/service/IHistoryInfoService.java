package com.huiyi.activiti.service;

import java.util.List;

import com.huiyi.activiti.vo.HiProcInsVo;

/**
 * @Auther: Ace Lee
 * @Date: 2019/3/7 16:55
 */
public interface IHistoryInfoService
{
    List<HiProcInsVo> getHiProcInsListDone(HiProcInsVo hiProcInsVo);
}

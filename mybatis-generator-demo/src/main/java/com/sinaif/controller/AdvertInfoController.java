package com.sinaif.controller;

import com.sinaif.entity.AdvertInfo;
import com.sinaif.service.AdvertInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.sinaif.common.base.BaseController;

/**
 * 广告资源表(AdvertInfo)表控制层
 *
 * @author makejava
 * @since 2018-10-30 11:06:14
 */
@RestController
@RequestMapping("advertInfo")
public class AdvertInfoController extends BaseController{
    /**
     * 服务对象
     */
    @Autowired
    private AdvertInfoService advertInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public AdvertInfo queryById(String id) {
        return advertInfoService.queryById(id);
    }

}
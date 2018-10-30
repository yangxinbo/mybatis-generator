package com.sinaif.service.impl;

import com.sinaif.entity.AdvertInfo;
import com.sinaif.dao.AdvertInfoDao;
import com.sinaif.service.AdvertInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinaif.common.base.CrudServiceImpl;


/**
 * 广告资源表(AdvertInfo)表服务实现类
 *
 * @author makejava
 * @since 2018-10-30 11:06:14
 */
@Service
public class AdvertInfoServiceImpl extends CrudServiceImpl<AdvertInfo, AdvertInfoDao> implements AdvertInfoService {

}
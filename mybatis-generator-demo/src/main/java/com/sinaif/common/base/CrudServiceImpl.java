package com.sinaif.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName    : Crud 实现类
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/10/30 10:21
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@Service
public abstract class CrudServiceImpl<T, D extends BaseDao<T>> implements BaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public T queryById(String id) {
        return dao.queryById(id);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param entity 实例对象
     * @return 对象列表
     */
    public List<T> queryBySelective(T entity) {
        return dao.queryBySelective(entity);
    }

    /**
     * 新增数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(T entity) {
        return dao.insert(entity);
    }

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public int update(T entity) {
        return dao.update(entity);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return dao.deleteById(id) > 0;
    }

}

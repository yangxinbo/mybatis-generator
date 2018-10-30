package com.sinaif.common.base;

import java.util.List;

/**
 * FileName    : Dao基类
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/10/30 10:21
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
public interface BaseDao<T> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    T queryById(String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param entity 实例对象
     * @return 对象列表
     */
    List<T> queryBySelective(T entity);

    /**
     * 新增数据
     *
     * @param entity 实例对象
     * @return 影响行数
     */
    int insert(T entity);

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 影响行数
     */
    int update(T entity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);
}

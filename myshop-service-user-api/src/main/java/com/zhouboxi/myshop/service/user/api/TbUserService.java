package com.zhouboxi.myshop.service.user.api;

import com.github.pagehelper.PageInfo;
import com.zhouboxi.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {
    /**
     * 查询全部数据
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbUser 查询参数
     * @return
     */
    PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser);
}

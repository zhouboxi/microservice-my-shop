package com.zhouboxi.myshop.service.content.api;

import com.github.pagehelper.PageInfo;
import com.zhouboxi.myshop.commons.domain.TbContent;
import com.zhouboxi.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbContentService {

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbContent 查询参数
     * @return
     */
    PageInfo<TbContent> page(int pageNum, int pageSize, TbContent tbContent);
}

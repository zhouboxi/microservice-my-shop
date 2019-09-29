package com.zhouboxi.myshop.service.content.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouboxi.myshop.commons.domain.TbContent;
import com.zhouboxi.myshop.commons.mapper.TbContentMapper;
import com.zhouboxi.myshop.service.content.api.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "${services.versions.content.v1}")
@Transactional(readOnly = true)
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public PageInfo<TbContent> page(int start, int length, TbContent tbContent) {
        PageHelper.offsetPage(start, length);
        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentMapper.select(tbContent));
        return pageInfo;
    }
}
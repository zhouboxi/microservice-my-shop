package com.zhouboxi.myshop.service.search.provider.mapper;


import com.zhouboxi.myshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbItemResultMapper {
    List<TbItemResult> selectAll();
}
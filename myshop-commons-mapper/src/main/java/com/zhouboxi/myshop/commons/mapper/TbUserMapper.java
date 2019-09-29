package com.zhouboxi.myshop.commons.mapper;

import com.zhouboxi.myshop.commons.domain.TbUser;
import com.zhouboxi.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;
@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}
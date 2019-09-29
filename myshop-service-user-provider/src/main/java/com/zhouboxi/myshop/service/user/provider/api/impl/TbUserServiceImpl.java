package com.zhouboxi.myshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouboxi.myshop.commons.domain.TbUser;
import com.zhouboxi.myshop.commons.mapper.TbUserMapper;
import com.zhouboxi.myshop.service.redis.api.RedisService;
import com.zhouboxi.myshop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

   /* @Reference(version = "${services.versions.redis.v1}")
    private RedisService redisService;*/

    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }

    @Override
    public PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser) {
        /*redisService.set("user","hello Redis");*/
        String username = tbUser.getUsername();
        String phone = tbUser.getPhone();
        String email = tbUser.getEmail();

        Example example = new Example(TbUser.class);
        example.createCriteria()
                .andLike("username", username != null ? username + "%" : null)
                .andLike("phone", phone != null ? phone + "%" : null)
                .andLike("email", email != null ? email + "%" : null);

        PageHelper.offsetPage(pageNum, pageSize);
        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectByExample(example));
        return pageInfo;
    }
}

package com.zhouboxi.myshop.service.upload.fastdfs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java 配置方式定义 StorageFactory 的 Bean 使其可以被依赖注入
 * <p>Title: FastDFSConfiguration</p>
 * <p>Description: </p>
 *
 * @author zhouboxi
 * @version 1.0.0
 * @date 2019/9/19 5:28
 */
@Configuration
public class FastDFSConfiguration {
    @Bean
    public StorageFactory storageFactory() {
        return new StorageFactory();
    }
}
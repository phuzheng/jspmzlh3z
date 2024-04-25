package com.config;


import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {

        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com..model.*");
        sqlSessionFactoryBean.setTypeEnumsPackage("com.model.enums");
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{paginationInterceptor()});
        sqlSessionFactoryBean.setGlobalConfig(globalConfig());

        return sqlSessionFactoryBean.getObject();
    }

    public Interceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

    public GlobalConfiguration globalConfig(){
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setIdType(IdType.ID_WORKER.getKey());
        globalConfiguration.setMetaObjectHandler(new MyMetaObjectHandler());
        return globalConfiguration;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.dao");
        return mapperScannerConfigurer;
    }
}

/**
 * 
 * SourceMapper sourceMapper = applicationContext.getBean(SourceMapper.class);
 * LocalMapper localMapper = applicationContext.getBean(LocalMapper.class);
 * 
 * 
 * 设置数据源为srcDataSource,使用了AOP测试时请将下面这行注释
 * MultipleDataSource.setDataSourceKey("srcDataSource");
 * sourceMapper.getList();
 * 设置数据源为localDataSource,使用AOP测试时请将下面这行注释
 * MultipleDataSource.setDataSourceKey("localDataSource");
 * localMapper.getList();
 * 
 * 
 * 
 * 
 * 
 */
package com.thinkgem.jeesite.common.persistence;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * {多数据源配置}
 * Created by Nick on 2015-12-1 下午3:06:27
 * @mail 490618067@qq.com
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
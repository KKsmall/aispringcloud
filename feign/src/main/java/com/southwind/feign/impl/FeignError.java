package com.southwind.feign.impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 创建 FeignProviderClient 接⼝的实现类 FeignError，定义容错处理逻辑，通过 @Component 注
 * 解将 FeignError 实例注⼊ IoC 容器中。这样如果正常逻辑出错就会执行这里的逻辑
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "系统维护中";
    }
}

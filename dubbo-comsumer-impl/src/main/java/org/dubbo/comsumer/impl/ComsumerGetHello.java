package org.dubbo.comsumer.impl;

import org.dubbo.provider.api.IProviderHello;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class ComsumerGetHello {

    
    // 引用服务提供方
    @Reference
    private IProviderHello providerHello;
    
    
    public void getHello() {
        providerHello.providerSay();
    }
    
}

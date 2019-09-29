1.安装zookeeper，并启动

   docker run --privileged=true -d --name zookeeper --restart=always -p 2181:2181 47.106.95.111:10010/zookeeper:20190928

2.搭建服务消费方，同时注册到 zookeeper

    引入依赖: dubbo zkclient，以及 服务提供方的API
    
    配置文件，配置zookeeper 注册中心
    
    业务层 使用dubbo注解 @Reference 引入服务提供者
    
3.启动消费方（先启动服务提供方）
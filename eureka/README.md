# Eureka

## 一、概述

​	Eureka是Netfilx开源的一款微服务组件，用于服务发现（Service Discovery），Eureka可搭建分布式集群，集群之间相互注册，每个服务都将所有注册到自生的服务复制到其他服务端

> 官方文档：https://cloud.spring.io/spring-cloud-netflix/2.2.x/reference/html/

## 二、服务端

### 1、单机版Eureka服务

#### 1.1、新建项目cloud-eureka-server7001



#### 1.2、修改pom依赖



#### 1.3、添加配置文件



#### 1.4、新建启动类



#### 1.5、运行测试



### 2、集群版Eureka服务

#### 1.1、新建项目cloud-eureka-server7002



#### 1.2、修改pom依赖



#### 1.3、添加配置文件



#### 1.4、新建启动类



#### 1.5、运行测试



## 三、客户端

#### 1、新建项目cloud-eureka-server8001



#### 2、修改pom依赖



#### 3、添加配置文件



#### 4、新建启动类



#### 5、运行测试

## 四、自我保护机制
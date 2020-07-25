# spring-cloud-sample
### 工程结构
1. spring-cloud-sample为父pom工程，定义依赖版本及构建插件
2. 所有子工程所需要的依赖必须在父pom中定义
3. 子工程归类构建，如：eureka示例在${user.dir}/eureka/*目录下

### 版本依赖

- 技术选型版本参照官方信息：https://start.spring.io/actuator/info

```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <spring.boot.version>2.2.2.RELEASE</spring.boot.version>
    <spring.cloud.version>Hoxton.SR1</spring.cloud.version>
    <spring.cloud.alibaba.version>2.1.0.RELEASE</spring.cloud.alibaba.version>
</properties>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>${spring.boot.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>${spring.cloud.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>${spring.cloud.alibaba.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

### 示例

1. 服务注册与发现
   - eureka
   - zookeeper
   - nacos
2. 服务调用
   - ribbon
   - fegin
   - openfegin
3. 服务熔断
   - hystrix 
   - sentinel
4. 服务配置
   - config
   - nacos
5. 服务网关
   - zuul
   - gateway
6. 消息总线
   - bus
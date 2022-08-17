

# SSM

Spring+SpringBoot+MybatisPlus

黑马视频教程地址:https://www.bilibili.com/video/BV1Fi4y1S7ix

## Spring

### Spring Framework 系统架构图

![image-20220719190349935](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202207191903008.png)

### IOC(Inversion of control)控制反转*

- 对象的创建权由程序转交给**外部**，这种思想就是控制反转
- Spring提供了一个IoC容器，来充当IoC思想的**外部**--->Core Container 核心容器
- IoC容器负责对象的创建、初始化等一系列操作，被创建或者被管理的对象在IoC容器中称为<span style="color:red">*Bean*</span>

### DI(Dependency Injection)依赖注入

- 在容器中建立bean与bean之间的**依赖关系**的整个过程

### Bean基础配置

#### Bean别名配置

![image-20220816141522862](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161415986.png)

#### Bean作用范围

![image-20220816141753645](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161417679.png)

<img src="https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161419598.png" alt="image-20220816141936557" style="zoom:67%;" />

### Bean的实例化

#### 构造方法(无参构造)

![image-20220816142612351](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161426402.png)



#### 静态工厂

![image-20220816143030983](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161430035.png)

#### 实例工厂

![image-20220816144040291](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161440335.png)

##### 实用

![image-20220816144234213](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161442255.png)



### Bean的生命周期

#### Bean的生命周期控制

##### 1

![image-20220816153423725](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161534776.png)

##### 2

![image-20220816153439613](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161534654.png)

#### Bean的生命周期

<img src="https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161535899.png" alt="image-20220816153552856" style="zoom:50%;" />

![image-20220816153624612](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161536646.png)

### 依赖注入

#### 普通方法

![image-20220816155426278](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161554322.png)

![image-20220816155550536](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161555588.png)





#### 构造方法

![image-20220816160434897](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161604949.png)

![image-20220816160502570](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161605640.png)

#### 自动装配

![image-20220816161936070](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161619139.png)

![image-20220816162610668](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161626736.png)

#### 注入集合

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="bookDao" class="com.red.dao.impl.BookDaoImpl">
        <property name="array">
            <array>
                <value>100</value>
                <value>200</value>
                <value>300</value>
            </array>
        </property>
        <property name="list">
            <list>
                <value>itit</value>
                <value>itit</value>
                <value>i11</value>
            </list>
        </property>
        <property name="set">
            <set>
                <value>hello</value>
                <value>world</value>
                <value>hello</value>
                <value>boy</value>
            </set>
        </property>
        <property name="map">
            <map>
                <entry key="con" value="cha"/>
                <entry key="con1" value="cha1"/>
                <entry key="con" value="cha1"/>
                <entry key="con22" value="cha22"/>
            </map>
        </property>
        <property name="properties">
            <props>
                <prop key="ccc">ccc</prop>
                <prop key="ccc1">ccc1</prop>
                <prop key="ccc">ccc2</prop>
                <prop key="ccc">ccc</prop>
            </props>
        </property>
    </bean>
</beans>
```

### 加载Properties文件

1. 开启context命名空间

   ![image-20220816171028823](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161710937.png)

2. 使用context空间加载properties文件

   ![image-20220816171438914](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161714972.png)

3. 使用属性占位符${}读取properties中的属性

   ![image-20220816171645440](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161716530.png)

![image-20220816171852169](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161718226.png)

![image-20220816172330050](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161723128.png)

### 容器总结

![image-20220816172811431](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161728461.png)

![image-20220816172754917](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161727987.png)

![image-20220816173345183](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161733249.png)

![image-20220816173409075](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161734151.png)

![image-20220816173626251](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161736335.png)

![image-20220816173723137](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161737202.png)

### 注解开发*

#### 注解开发定义bean

![image-20220816175128924](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161751981.png)

![image-20220816175208381](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161752430.png)

#### 纯注解开发

![image-20220816180147274](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161801336.png)

![image-20220816180230969](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161802054.png)

#### bean作用范围与生命周期管理

![image-20220816180704722](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161807791.png)

![image-20220816180827491](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161808555.png)

#### 依赖注入

![image-20220816181400075](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161814171.png)

![image-20220816181429701](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161814786.png)

![image-20220816181858771](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161818868.png)

![image-20220816182025136](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161820181.png)

#### 第三方Bean管理

![image-20220816182941365](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161829408.png)

![image-20220816183018259](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161830355.png)

#### 第三方bean依赖注入

![image-20220816183413586](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161834652.png)

![image-20220816183514429](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161835486.png)

#### 注解开发总结

![image-20220816183817390](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208161838441.png)

### Spring整合MyBatis

![image-20220817203614030](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208172036194.png)

![image-20220817203648457](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208172036539.png)























## SpringBoot





## MybatisPlus


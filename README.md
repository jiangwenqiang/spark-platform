# spark-platform
spark 开发平台

- 基于 Spring Cloud Hoxton 、Spring Boot 2.2、 OAuth2 的RBAC权限管理系统  
- 基于vue-element-template，更简洁的页面，实现的前后端交互
- 前后端分离架构，客户端和服务端纯Token交互，接口全部使用restful风格
- 认证服务器与资源服务器分离，方便接入自己的微服务系统；
- 基于flowable的工作流系统，提供完善基于业务的流程系统
- 提供代码生成器、封装Mybatis plus 查询，提高开发效率

 _### 如果您喜欢，请小手抖一下，帮作者点个赞_  :smile: 

注意：
1. 工作流中没有把flowable-modeler 流程设计功能引入，需要的请自行到此地址下载:
[下载官方war包](https://download.csdn.net/download/wangdingfeng5141/12299018) 官方war包。后续我还会另起一个工作流服务把这些全部集成，但是spark项目就暂时不会集成了。
2. 工作流测试请移步到
[工作流测试](https://gitee.com/dreamfeng/spark-platform/tree/master/spark-flowable)

### 已实现功能
|   用户管理  |  角色管理   |  菜单管理   |  部门管理   |  字典管理   |  客户端管理   |  待办事项   |  已办事项   |
| --- | --- | --- | --- | --- | --- | --- | --- |
|   流程管理   |  系统日志   |  系统监控   | 代码生成器    | 网关限流    | 文件管理    |   登录日志  |     |




### 项目地址
 平台  | spark-platform（后端）|spark-admin（前端）
---|---|---
GitHub | [https://github.com/wangdingfeng/spark-platform](https://github.com/wangdingfeng/spark-platform)|[https://github.com/wangdingfeng/spark-admin](https://github.com/wangdingfeng/spark-admin)
Gitee  | [https://gitee.com/dreamfeng/spark-platform](https://gitee.com/dreamfeng/spark-platform)|[https://gitee.com/dreamfeng/spark-admin](https://gitee.com/dreamfeng/spark-admin)

### 演示地址

演示地址：[http://www.sparkplatform.cn/](http://www.sparkplatform.cn/)

演示环境账号密码：
| 账号  | 密码   | 权限               |
| ----- | ------ | ------------------ |
| admin | 123456 | 除删除外所有的权限 |
| zuzhang | 123456 | 工作流权限 |
| zhubian1 | 123456 | 工作流权限 |
| zhubian2 | 123456 | 工作流权限 |

依赖 | 版本
---|---
Spring Boot |  2.2.6.RELEASE 
Spring Cloud | Hoxton.SR3   
Flowable | 6.4.0
Mybatis Plus | 3.3.1
Spring Boot Admin | 2.2.0
Security Jwt | 1.0.10.RELEASE

#### 模块说明
```lua
spark-platform 
├── spark-auth -- 授权服务 oauth2
└── spark-common -- 系统公共模块 
     ├── spark-common-base -- 基本公共类
     ├── spark-common-config -- 公共配置类
     ├── spark-common-feigh -- 公共feigh类
     ├── spark-common-security -- 安全工具类
     └── spark-common-utils -- 工具类
     └── spark-common-log -- 日志记录
├── spark-gateway -- Spring Cloud Gateway网关
├── spark-eureka -- Spring Cloud eureka注册中心
├── spark-control -- Spring Boot Admin监控
└── spark-admin -- 通用用户权限管理模块
     └── spark-admin-api -- 通用用户权限管理系统公共api模块
     └── spark-admin-biz -- 通用用户权限管理系统业务处理模块
└── spark-flowable -- 通用工作流模块
     └── spark-flowable-api -- 通用工作流模块公共api模块
     └── spark-flowable-biz -- 通用工作流模块业务处理模块
├── spark-cms -- 内容管理平台
```
 **平台截图**
 ![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/205849_8b0d2d5c_1890906.png "屏幕截图.png")
 ![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/205924_a89d430e_1890906.png "屏幕截图.png")
 ![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/205952_3dec6a78_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210017_0e8f6a85_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210044_dae7ffed_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210119_395a0d45_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210138_905a364c_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210204_2518650a_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210247_b290c63a_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210359_b671c3c6_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210425_955364bf_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210505_dd8d86d8_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210541_e9f22e3c_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210554_488d1efb_1890906.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0502/210633_70f91502_1890906.png "屏幕截图.png")
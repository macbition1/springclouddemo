# springclouddemo
基于springcloud的外卖平台
### 项目概述
- 客户端
功能：用户登录、用户退出、菜品订购、我的订单
- 后台
功能：管理员登录、管理员退出、添加菜品、查询菜品、修改菜品、删除菜品、订单处理、添加用户、查询用户、删除用户

### 系统框架
首先分配出4个服务提供者，account、menu、order、user。

​		account 提供账户服务：用户和管理员登陆。

​		menu 提供菜品服务：添加菜品、查询菜品、修改菜品、删除菜品。

​		order 提供订单服务：添加订单、查询订单、删除订单、处理订单。

​		user 提供用户服务：添加用户、查询用户、删除用户。

![model](C:\Users\12420\Pictures\Saved Pictures\model.png)

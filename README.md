jmarket商城项目已发布博客于CSDN上，博客中涵盖了更多内容，若需要了解得更多，可以访问博客链接: [基于SSM的商城项目（jmarket商城）](https://blog.csdn.net/m0_46991388/article/details/119281310)。

#### 一、项目概述

项目名：jmarket（即买客）商城
开发环境：
① win10；
② IntelliJ IDEA 2020.1.1；
③ Visual Studio Code；
④ maven3.6.3；
⑤ tomcat8.5；
⑥ MySQL8.0；
开发成果--六大项目功能：
① 登录&注册模块；
② 商品列表模块；
③ 购买商品&加入购物车模块；
④ 用户个人中心；
⑤ 商家个人中心；
⑥ 商品条件查询；
由我队友开发的第七个功能--⑦ 支付宝沙箱支付功能，是他在最危急的时候加班加点把这个功能赶工出来的，最后在答辩的时候我们通过这个骚操作成功的惊艳了一把台下的老师，这是我队友的博客，你们若是想了解这个功能可以去和他交流一下，博客链接: [小猪乔治猪](https://blog.csdn.net/qq_43955644)。

#### 二、项目结构说明



<img src="https://img-blog.csdnimg.cn/e9ddb3b8f4b64571b069341c75082e35.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center" alt="jmarket项目结构说明" style="zoom:80%;" />

#### 三、项目运行方法

本项目是使用IDEA进行开发的，启动本项目只需要在IDEA中进行如下两项配置:1、Maven配置；2、tomcat配置。

1、Maven配置：
<img src="https://img-blog.csdnimg.cn/dd77bfbb8a194f15bcb46e18bdc22184.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center" alt="打开设置" style="zoom:50%;" />
![本地maven配置](https://img-blog.csdnimg.cn/555ce9ef29d248b88278428c6cdb01a0.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
2、tomcat配置
![编辑配置](https://img-blog.csdnimg.cn/ac509399a3e34c60963d1c11309f6c46.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
![tomcat部署部分配置](https://img-blog.csdnimg.cn/b6860cb6efc74e00a71251e0b8f957d5.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
若此处部署部分应用程序上下文内容不一致的时，先点击-号，然后点击+号，选择部署工件即可
<img src="https://img-blog.csdnimg.cn/8fc2ba5fe17e4a2d9b7099118cc1ed90.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center" alt="部署工件" style="zoom:80%;" />
<img src="https://img-blog.csdnimg.cn/cfbe09894ced4bbbae21434dffdfd4cd.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center" alt="部署工件2" style="zoom:80%;" />

将默认值/jmarket_war修改为/jmarket即可
经过以上两个步骤即可将jmarket商品项目启动起来

#### 四、项目成果展示
##### 1、登录&注册模块
登录
登录（没有用户时）
![登录（没有用户时）](https://img-blog.csdnimg.cn/671c0a074f5f4c14ab781e04062c5d9f.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
登录（密码错误时）
![登录（密码错误时）](https://img-blog.csdnimg.cn/18eeaca0d81c4f929a97473b9019c55d.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
注册
商家：
商家注册（两次密码不一致时）
![商家注册（两次密码不一致时）](https://img-blog.csdnimg.cn/4d549a2a36824d39b5579460fa737415.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
商家注册（用户名被使用时）
![商家注册（用户名被使用时）](https://img-blog.csdnimg.cn/9742545611be42ddbb9e0fad5a7e1665.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
用户：
用户注册（两次密码不一致时）
![用户注册（两次密码不一致时）](https://img-blog.csdnimg.cn/4b049d6e5f74486b8a222fa998f47e8f.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
用户注册（用户名被使用时）
![用户注册（用户名被使用时）](https://img-blog.csdnimg.cn/fc1022f7c93447c5bda1e685ebbdc228.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
##### 2、商品列表模块
商品列表 
![商品列表](https://img-blog.csdnimg.cn/cac13ee291ef4437a6130053e06538e0.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
商品分类
![商品分类](https://img-blog.csdnimg.cn/0bb1e06cb6df4eafb520c1a4c271f436.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
商品详情
![商品详情](https://img-blog.csdnimg.cn/9a2c4333353541a4a020fde1dc5f3517.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
##### 3、购买商品&加入购物车模块
购买
商家：
商家购买
![商家购买](https://img-blog.csdnimg.cn/331fa5e73d9441d5bdd1cac873cb28ec.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
用户：
购买详情
![购买详情](https://img-blog.csdnimg.cn/384957b192c9408595284cb3d63f44f9.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
购买完成
![购买完成](https://img-blog.csdnimg.cn/a08a9f23bbf542c49322f6ba7fc32351.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
加入购物车
商家：
商家加入购物车
![商家加入购物车](https://img-blog.csdnimg.cn/2c5e8a9b4bfc410eaaa7c337aa6c4d99.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)用户：
用户加入购物车
![用户加入购物车](https://img-blog.csdnimg.cn/6cbf5a1f073d40ebaaa6d16dad0117c5.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
##### 4、用户个人中心
订单列表
![订单列表](https://img-blog.csdnimg.cn/aec6d299e89440ba89232de5bc2f9c7b.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
##### 5、商家个人中心
商家发布商品
![商家发布商品](https://img-blog.csdnimg.cn/c1038929e3984dbf992350c929123086.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
消息列表
![商家消息列表](https://img-blog.csdnimg.cn/1908f3a2548748ce8ddac7a7b43d5203.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
##### 6、额外功能--支付宝沙箱支付
支付宝账号登录
![支付宝付款](https://img-blog.csdnimg.cn/17f24f6f343c4029aacccabb835adcfe.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
支付宝确认付款
![支付宝确认付款](https://img-blog.csdnimg.cn/1f5c6c648c0e46da93911977bafd1251.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
支付宝付款成功
![支付宝付款成功](https://img-blog.csdnimg.cn/8c71bf90d2784cd29744ad37a08c10a6.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2OTkxMzg4,size_16,color_FFFFFF,t_70#pic_center)
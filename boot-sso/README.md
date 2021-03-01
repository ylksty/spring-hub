### 单点登录demo
#### 原理及过程
* client登录，跳转server登录
* server登录，添加token到cookie，带上token参数，回跳client
* client带上token，调用server的userInfo接口，获得用户数据，生成client的session，登录成功
# AliPaySandBox-SpringBoot
### 支付宝沙箱集成SpringBoot示例
<details><summary>输入交易信息</summary>
<img src="./图片/输入交易信息.png"/>
</details>
<details><summary>支付界面</summary>
<img src="./图片/支付界面.png"/>
</details>

- 可以使用官方提供的支付宝沙箱环境的账号的app进行支付
- 使用了支付宝sdk的easy版本实现了跳转到支付宝进行支付
- 外部回调的post接口我使用的是SakuraFrp进行端口映射，但是由于现在的政策原因，就支持https映射而且是野证书，所以异步回调没有被成功调用，但是支付宝会自动调用同步回调接口，所以支付成功后会跳转到支付成功页面，但是服务端无法得到回调信息去修改订单记录，这里如果想真正实现的话，就找一个好用的http映射或者使用自己的公网ip

By：tyza66

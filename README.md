#huiyi-chain

##产品名称
基于区块链技术的基金会运营综合管理平台。

##背景
慈善在中国的发展于上世纪90年代逐渐苏醒，伴随着经济的高速发展，慈善事业的发展有巨大的空间。目前的国内慈善事业现状：

> - 慈善机构缺乏强有力的管控和被监管；
> - 公信力低下甚至缺失；信息公开程度差；
> - 善款、物资等分配不公；仓储物流跟踪不到位；
> - 缺少市场化的策划和推动。

现代慈善事业是与时俱进的，它不仅需要道德支撑；也需要新的理念、高素质的人才来支撑；更需要得到安全的区块链技术的支撑。

## 代码仓库
* 后台：https://mayuanjy.coding.net/p/huiyi-chain/d/huiyi-chain/git
* 前端：https://mayuanjy.coding.net/p/huiyi-chain-front/d/huiyi-chain-front/git

##快速启动

###基础环境
* JDK >= 1.8(推荐1.8版本)
* MySQL >= 5.5.0 (推荐5.7版本)
* Maven >= 3.0
* lombok 插件
* Redis >=3.2

###服务器端的（依次）启动
* HuiYiEurekaApp
* HuiYiGatewayApp
* HuiYiSystemApp
* HuiYiAuthApp
* HuiYiActApp（可选）
* HuiYiGenApp（可选）

###前端的启动
* cd huiyi-chain-front
* yarn run serve

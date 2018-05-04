[![](https://jitpack.io/v/feisher/NaviUtil.svg)](https://jitpack.io/#feisher/NaviUtil)

# NaviUtil
外置导航调起，支持百度+高德+浏览器

## 编写初衷
  简化各种导航重做工作，集成仿ios对话框，防止频繁改动UI，

## 依赖使用方式

 ```java
    implementation 'com.github.feisher:NaviUtil:latest.integration'

    "latest.integration"代表的是上面图片中对应的最新版本版本号例如 :1.0.3
 ```

## 库使用方式

```java
 NaviUtil.with(this,NaviUtil.DB09).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",BuildConfig.APPLICATION_ID);
```
### 注意：
    兼容三种坐标系类型，这里是必选项代码已限制，，起点经纬度+终点经纬度+applicationId 均为必要参数，
    支持自动识别手机安装的地图app，仅有百度or高德将直接跳转，都有弹出仿ios选择框，均无弹出仿ios提示框，
    提示用户是否使用浏览器打开
[![](https://jitpack.io/v/feisher/NaviUtil.svg)](https://jitpack.io/#feisher/NaviUtil)

# NaviUtil
外置导航调起，支持百度+高德+腾讯地图+浏览器

## 编写初衷
  简化各种导航重做工作，集成仿ios对话框，防止频繁改动UI，
![](https://github.com/feisher/NaviUtil/blob/master/imgs/%E4%B8%89%E7%A7%8D%E5%9C%B0%E5%9B%BE.gif)
![](https://github.com/feisher/NaviUtil/blob/master/imgs/%E5%8D%95%E5%9C%B0%E5%9B%BE.mp4)
![](https://github.com/feisher/NaviUtil/blob/master/imgs/%E5%8F%8C%E5%9C%B0%E5%9B%BE.mp4)

## 依赖方式

 ```java
    implementation 'com.github.feisher:NaviUtil:latest.integration'

 ```
    "latest.integration"代表的是上面图片中对应的最新版本版本号例如 :implementation 'com.github.feisher:NaviUtil:1.0.3'

    "implementation"为AS3.0以上版本依赖方式 ，低端版本请使用 compile 方式


## 代码中使用方式

```java
 NaviUtil.with(this,NaviUtil.DB09).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",getApplicationInfo().name);
```
    BuildConfig.APPLICATION_ID 等价于  getApplicationInfo().name ，但建议使用后者，可保证组件或者模块中使用不容易出错

### 新功能上线
     从1.0.4版本起，新增支持腾讯地图 ，三种地图智能识别，用户手机只有一种时自动选择跳转，多个弹窗
     新增 导航模式设置(默认骑行模式)，可选择 公交 ，自驾 ，骑行 ，步行 ，三种地图均支持
  ##### 新功能使用方式
  ```java
              //默认骑行模式
              NaviUtil.with(this@MainActivity,NaviUtil.DB09).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
              //或者加入限制的骑行模式(和上面一种用法效果一样)
              NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.RIDE).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
               //公交模式
              NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.BUS).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
               //自驾模式
              NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.CAR).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
               //步行模式
              NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.WALK).navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)

  ```

### 注意：
    兼容三种坐标系类型，这里是必选项代码已限制，，起点经纬度+终点经纬度+applicationId 均为必要参数，
    支持自动识别手机安装的地图app，仅有百度or高德将直接跳转，都有弹出仿ios选择框，均无弹出仿ios提示框，
    提示用户是否使用浏览器打开
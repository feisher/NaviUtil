package com.feisher.naviutil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yusong.plugin_navi.NaviUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sLat = 30.3480036
        var sLng = 120.020331
        var eLat = 30.355539
        var eLng = 120.016421
        //注意，集成请使用自己的签名文件到百度和高德平台申请创建安卓应用
        button.setOnClickListener {
            NaviUtil.with(this@MainActivity,NaviUtil.DB09)
                    .navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",BuildConfig.APPLICATION_ID)
        }
    }
}

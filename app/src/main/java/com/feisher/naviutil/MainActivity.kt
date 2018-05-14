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
                    .navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
        }
        button2.setOnClickListener {
            NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.BUS)
                    .navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
        }
        button3.setOnClickListener {
            NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.CAR)
                    .navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
        }
        button4.setOnClickListener {
            NaviUtil.with(this@MainActivity,NaviUtil.DB09,NaviUtil.WALK)
                    .navi(sLat,sLng,"我的位置",eLat,eLng,"目的地",applicationInfo.packageName)
        }
        System.exit(0)

    }


    override fun onAttachedToWindow() {
        logd( "onAttachedToWindow: ");
        super.onAttachedToWindow()
    }
    override fun onRestart() {
        logd( "onRestart: ");
        super.onRestart()
    }
    override fun onPause() {
        logd( "onPause: ");
        super.onPause()
    }
    override fun onPostResume() {
        logd( "onPostResume: ");
        super.onPostResume()
    }
    override fun onStop() {
        logd( "onStop: ");
        super.onStop()
    }

    override fun onDestroy() {
        logd( "onDestroy: ");
        super.onDestroy()
    }

}

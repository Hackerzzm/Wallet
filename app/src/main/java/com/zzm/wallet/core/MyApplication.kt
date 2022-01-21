package com.zzm.wallet.core

import android.app.Activity
import android.app.Application
import android.os.Process
import java.util.LinkedList
import kotlin.system.exitProcess

class MyApplication:Application() {
  override fun onCreate() {
    super.onCreate()
    application = this
  }

  companion object{
    lateinit var application: Application
    var activityList: MutableList<Activity> = LinkedList()
    //添加Activity到容器中
    fun addActivity(activity: Activity?) {
      activityList.add(activity!!)
    }
    //结束指定的Activity
    fun finishActivity(activity: Activity?) {
      if (activity != null) {
        activityList.remove(activity)
        activity.finish()
      }
    }
    fun exit() {
      //遍历所有Activity并finish()
      for (activity in activityList) {
        activity.finish()
      }
      //这个主要是用来关闭进程的, 光把所有activity finish的话，进程是不会关闭的
      Process.killProcess(Process.myPid())
      exitProcess(0)
    }
  }
}
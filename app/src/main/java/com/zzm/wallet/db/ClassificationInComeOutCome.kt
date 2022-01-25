package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 收入支出类型
 */
@Entity
data class ClassificationInComeOutCome(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "name") var name: String?,//名称
  @ColumnInfo(name = "icon") var icon: String?,//图标
  @ColumnInfo(name = "iconNight") var iconNight: String?,//夜间模式图标
  @ColumnInfo(name = "isNotLeaf") var isNotLeaf: Boolean?,//是否为一级分类
  @ColumnInfo(name = "fatherNode") var fatherNode: Int?,//若为二级分类，父节点为
  @ColumnInfo(name = "inComeOutCome") var inComeOutCome: Boolean?,//收入;支出
  @ColumnInfo(name = "whichBook") var whichBook: Int?,//仅显示在哪本账本
)
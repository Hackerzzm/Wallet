package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 标签
 */
@Entity
data class Tag(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "name") val name: String?,//名称
  @ColumnInfo(name = "whichBook") var whichBook: Int?,//仅显示在哪本账本,null为全部可见
  @ColumnInfo(name = "color") var color: Int?,//颜色
  @ColumnInfo(name = "isNotLeaf") var isNotLeaf: Boolean?,//是否为一级分类
  @ColumnInfo(name = "fatherNode") var fatherNode: Int?,//若为二级分类，父节点为
)
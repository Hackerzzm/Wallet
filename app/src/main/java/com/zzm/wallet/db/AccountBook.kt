package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

/**
 * 账本
 */
data class AccountBook(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "name") var name: String?,//名称
  @ColumnInfo(name = "createDate") var createTime: Long?,//创建时间
  @ColumnInfo(name = "lastEditDate") var lastEditTime: Long?,//最近修改时间
)

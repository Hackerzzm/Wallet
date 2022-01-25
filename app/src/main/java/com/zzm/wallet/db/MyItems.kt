package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 物品
 */
@Entity
data class MyItems(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "name") var name: String?,//名称
  @ColumnInfo(name = "price") var price: Float?,//价格
  @ColumnInfo(name = "value") var value: Float?,//价值
)

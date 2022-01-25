package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 流水
 */
@Entity
data class AccountStatement(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "accountUID") var accountUID: Int?,//账户UID
  @ColumnInfo(name = "value") var value: Float?,//涉及金额
  @ColumnInfo(name = "inComeOutCome") var inComeOutCome: Boolean?,//收入支出（收入支出相对账户而言，收入即物品变为了账户里的金额）
  @ColumnInfo(name = "itemUID") var itemUID: Int?,//物品UID
  @ColumnInfo(name = "date") var date: String?,//日期便于显示
  @ColumnInfo(name = "time") var time: String?,//时间便于显示
  @ColumnInfo(name = "timestamp") var timestamp: Long?,//时间戳
  @ColumnInfo(name = "remark") var remark: String?,//备注
)

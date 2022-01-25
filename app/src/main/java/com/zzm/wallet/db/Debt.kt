package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 负债（应付账款、蚂蚁花呗、信用卡、京东白条）
 */
@Entity
data class Debt(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "name") var name: String?,//名称
  @ColumnInfo(name = "debtType") var debtType: String?,//类型
  @ColumnInfo(name = "lineOfCredit") var lineOfCredit: Float?,//信用额度
  @ColumnInfo(name = "arrears") var arrears: Float?,//欠款
  @ColumnInfo(name = "billDate") var billDate: Int?,//账单日
  @ColumnInfo(name = "dueDate") var dueDate: Int?,//还款日
  @ColumnInfo(name = "bank") var bank: String?,//发卡行
)

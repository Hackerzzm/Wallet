package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 账户(现金、银行卡{储蓄卡、借记卡、存折}、应收账款{报销}、虚拟账户{支付宝、微信}、储值卡{公交卡、地铁卡、饭卡、校园卡}、股票、基金，现金券{超市卡、购物券})
 * 子账户？
 */
@Entity
data class Account(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "name") var name: String?,//名称
  @ColumnInfo(name = "value") var value: Float?,//余额
  @ColumnInfo(name = "nickname") var nickname: String?,//简称
  @ColumnInfo(name = "remark") var remark: String?,//备注
  @ColumnInfo(name = "cardNumber") var cardNumber: String?,//卡号
  @ColumnInfo(name = "bank") var bank: String?,//发卡行
  @ColumnInfo(name = "market") var market: String?,//开户机构
  @ColumnInfo(name = "icon") var icon: String?,//图标
  @ColumnInfo(name = "group") var group: Int?,//分组
  @ColumnInfo(name = "isIncludedInTotalAsset") var isIncludedInTotalAsset: Boolean?,//计入总资产
  @ColumnInfo(name = "whichBook") var whichBook: Int?,//仅显示在哪本账本
  @ColumnInfo(name = "currency") var currency: String?,//币种
  @ColumnInfo(name = "accountType") var accountType: String?,//账户类型
)
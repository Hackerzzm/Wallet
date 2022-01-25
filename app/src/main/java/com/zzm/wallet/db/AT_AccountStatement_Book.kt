package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

/**
 * 流水-账本 关联表
 */
data class AT_AccountStatement_Book(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
  @ColumnInfo(name = "accountStatementUID") var accountStatementUID: Int?,//流水UID
  @ColumnInfo(name = "accountBookUID") var accountBookUID: Int?,//账本UID
)

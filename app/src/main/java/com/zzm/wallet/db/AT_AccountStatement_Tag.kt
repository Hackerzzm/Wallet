package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 流水—标签表 关联表
 */
@Entity
data class AT_AccountStatement_Tag(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "accountStatementUID") var accountStatementUID: Int?,//流水UID
  @ColumnInfo(name = "tagUID") var tagUID: Int?,//标签UID
)

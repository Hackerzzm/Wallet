package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 收入支出标签
 */
@Entity
data class Tag(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "name") val name: String?,
  @ColumnInfo(name = "isCommon") val isCommon: Boolean?,
  @ColumnInfo(name = "whichBook") val whichBook: Int?,
  @ColumnInfo(name = "color") val color: Int?,
  @ColumnInfo(name = "isNotLeaf") val isNotLeaf: Boolean?,
  @ColumnInfo(name = "fatherNode") val fatherNode: Int?,
)
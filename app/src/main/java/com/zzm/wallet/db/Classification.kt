package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Classification(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "name") val name: String?,
  @ColumnInfo(name = "icon") val icon: String?,
  @ColumnInfo(name = "iconNight") val iconNight: String?,
  @ColumnInfo(name = "isNotLeaf") val isNotLeaf: Boolean?,
  @ColumnInfo(name = "fatherNode") val fatherNode: Int?,
  @ColumnInfo(name = "inComeOutCome") val inComeOutCome: Boolean?,
  @ColumnInfo(name = "isCommon") val isCommon: Boolean?,
  @ColumnInfo(name = "whichBook") val whichBook: Int?,
)
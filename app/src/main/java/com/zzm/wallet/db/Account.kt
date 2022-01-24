package com.zzm.wallet.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Account(
  @PrimaryKey(autoGenerate = true) val uid: Int?,
  @ColumnInfo(name = "name") val name: String?,
  @ColumnInfo(name = "icon") val icon: String?,
)
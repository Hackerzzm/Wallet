package com.zzm.wallet.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 物品位置（家，房间，家具，隔层，收纳盒）
 */
@Entity
data class ClassificationItemPosition(
  @PrimaryKey(autoGenerate = true) var uid: Int?,
)

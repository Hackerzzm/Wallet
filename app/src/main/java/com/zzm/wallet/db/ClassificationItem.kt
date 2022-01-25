package com.zzm.wallet.db

import androidx.room.PrimaryKey

/**
 * 物品种类（食品、药品、衣物、书籍、虚拟物品）
 */
data class ClassificationItem(
  @PrimaryKey(autoGenerate = true) var uid: Int?,

)

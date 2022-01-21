package com.zzm.wallet.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
  abstract fun userDao(): UserDAO

  companion object{
    const val DATABASE_NAME = "appDatabase.db"
    private var appDatabase: AppDatabase? = null
    @Synchronized
    fun getInstance(context: Context?): AppDatabase? {
      if (appDatabase == null) {
        appDatabase = Room.databaseBuilder(
          context!!,
          AppDatabase::class.java,
          DATABASE_NAME
        )
          //.addMigrations(Migration56, Migration67,Migration78,Migration89,Migration910,Migration1011)
          //.allowMainThreadQueries() //默认room不允许在主线程操作数据库，这里设置允许
          .build()
      }
      return appDatabase
    }
  }
}
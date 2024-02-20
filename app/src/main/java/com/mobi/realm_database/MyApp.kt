package com.mobi.realm_database

import android.app.Application
import com.mobi.realm_database.models.Address
import com.mobi.realm_database.models.Course
import com.mobi.realm_database.models.Student
import com.mobi.realm_database.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp:Application() {
    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate(){
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }

}
package com.granzotto.mqttpainel

import android.app.Application
import com.granzotto.mqttpainel.utils.MyConstants
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by marciogranzotto on 5/11/16.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfiguration = RealmConfiguration.Builder()
                .schemaVersion(MyConstants.SCHEMA_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(realmConfiguration)
    }

}
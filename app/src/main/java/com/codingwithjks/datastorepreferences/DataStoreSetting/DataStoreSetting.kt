package com.codingwithjks.datastorepreferences.DataStoreSetting

import android.content.Context
import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

class DataStoreSetting(private val context: Context) {

    object PreferencesKeys{
         val name = preferencesKey<String>("name")
    }

    private val dataStore:DataStore<Preferences> = context.createDataStore(name = "setting")

    suspend fun saveToDataStore(name:String)
    {
        dataStore.edit { preference->
            preference[PreferencesKeys.name]=name
        }
    }

    val readOutFromDataStore:Flow<String> = dataStore.data
        .catch {
            if(this is IOException){
                emit(emptyPreferences())
            }
        }.map{preference->
            val name:String=preference[PreferencesKeys.name]?:"none"
            name
        }

}
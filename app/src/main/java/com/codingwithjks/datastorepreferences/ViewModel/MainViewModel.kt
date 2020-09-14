package com.codingwithjks.datastorepreferences.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.codingwithjks.datastorepreferences.DataStoreSetting.DataStoreSetting
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val dataStoreSetting = DataStoreSetting(application)
    val readFromDataStore= dataStoreSetting.readOutFromDataStore.asLiveData()

    fun saveToDataStore(name:String)
    {
        viewModelScope.launch(Dispatchers.IO) {
            dataStoreSetting.saveToDataStore(name)
        }
    }
}
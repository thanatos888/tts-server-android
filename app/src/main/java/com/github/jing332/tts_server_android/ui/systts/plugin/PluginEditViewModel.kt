package com.github.jing332.tts_server_android.ui.systts.plugin

import androidx.lifecycle.ViewModel
import com.github.jing332.tts_server_android.data.entities.plugin.Plugin
import com.github.jing332.tts_server_android.help.plugin.JsEngine

class PluginEditViewModel : ViewModel() {
    lateinit var pluginEngine: JsEngine
    fun setData(data: Plugin) {
        pluginEngine = JsEngine(plugin = data)
    }


}
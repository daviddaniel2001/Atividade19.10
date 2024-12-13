package com.example.atividade19_10

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AtividadePrincipal : AppCompatActivity() {

    private lateinit var receptorEnergia: MonitorEnergiaReceiver

    override fun onCreate(instanciaSalva: Bundle?) {
        super.onCreate(instanciaSalva)
        setContentView(R.layout.activity_main)

        // Inicializando o receptor
        receptorEnergia = MonitorEnergiaReceiver()

        // Registrando o BroadcastReceiver programaticamente
        val filtroIntencao = IntentFilter().apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        registerReceiver(receptorEnergia, filtroIntencao)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Cancelando o registro do receptor
        unregisterReceiver(receptorEnergia)
    }
}

package com.example.atividade19_10

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MonitorEnergiaReceiver : BroadcastReceiver() {
    override fun onReceive(contexto: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(contexto, "Dispositivo conectado à energia elétrica!", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                Toast.makeText(contexto, "Dispositivo desconectado da energia elétrica!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

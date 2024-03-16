package com.norm.mybluetoothchat.presentation

import com.norm.mybluetoothchat.domain.chat.BluetoothDevice
import com.norm.mybluetoothchat.domain.chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMassage: String? = null,
    val messages: List<BluetoothMessage> = emptyList(),
)
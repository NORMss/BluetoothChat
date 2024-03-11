package com.norm.mybluetoothchat.presentation

import com.norm.mybluetoothchat.domain.chat.BluetoothDevice
import com.norm.mybluetoothchat.domain.chat.BluetoothDeviceDomain

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
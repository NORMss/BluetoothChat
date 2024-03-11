package com.norm.mybluetoothchat.domain.chat

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    val scanDevices: StateFlow<List<BluetoothDeviceDomain>>
    val pairedDevices: StateFlow<List<BluetoothDeviceDomain>>

    fun startDiscovery()
    fun stopDiscovery()

    fun release()
}
package com.norm.mybluetoothchat.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.norm.mybluetoothchat.domain.chat.BluetoothMessage
import com.norm.mybluetoothchat.ui.theme.MyBluetoothChatTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChatMessage(
    message: BluetoothMessage,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(
                RoundedCornerShape(
                    topStart = if (message.isFromLocalUser) 16.dp else 0.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = if (message.isFromLocalUser) 0.dp else 16.dp,
                )
            )
            .background(
                if (message.isFromLocalUser) MaterialTheme.colorScheme.secondaryContainer
                else MaterialTheme.colorScheme.tertiaryContainer
            )
            .padding(16.dp)
    ) {
        Text(
            text = message.senderName,
            fontSize = 10.sp,
            color =
            if (message.isFromLocalUser) MaterialTheme.colorScheme.onSecondaryContainer
            else MaterialTheme.colorScheme.onTertiaryContainer
        )
        Text(
            text = message.message,
            color =
            if (message.isFromLocalUser) MaterialTheme.colorScheme.onSecondaryContainer
            else MaterialTheme.colorScheme.onTertiaryContainer,
            modifier = Modifier.widthIn(max = 256.dp)
        )
    }
}

@Preview
@Composable
fun ChatMessagePreview() {
    MyBluetoothChatTheme {
        ChatMessage(
            message = BluetoothMessage(
                message = "Hello, Android!",
                senderName = "Redmi N9S",
                isFromLocalUser = true
            )
        )
    }
}
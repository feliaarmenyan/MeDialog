package com.example.medialog.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medialog.R
import com.example.medialog.ui.theme.Purple700

@Composable
fun ToolbarWithMenu(
    title: String,
    onBackClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Purple700)
    ) {

        Divider(
            modifier = Modifier
                .height(1.dp)
                .align(Alignment.BottomCenter)
        )

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                modifier = Modifier
                    .weight(0.1f)
                    .padding(start = 4.dp),
                onClick = onBackClick
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = null,
                    tint = Color.White
                )
            }


            Text(
                modifier = Modifier
                    .weight(0.9f)
                    .padding(end = 32.dp),
                text = title,
                style = MaterialTheme.typography.subtitle1.copy(
                    Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W600
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Description(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .verticalScroll(
                rememberScrollState()
            ),
        style = TextStyle(Color.White)
    )
}
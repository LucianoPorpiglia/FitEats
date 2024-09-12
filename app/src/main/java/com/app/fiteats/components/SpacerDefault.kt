package com.app.fiteats.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpacerH(size: Dp = 10.dp){
    Spacer(modifier = Modifier.height(size))
}

@Composable
fun SpacerW(size: Dp = 10.dp){
    Spacer(modifier = Modifier.width(size))
}
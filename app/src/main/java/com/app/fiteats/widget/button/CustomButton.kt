package com.app.fiteats.widget.button

import androidx.annotation.StringRes
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    modifier: Modifier,
    color: Color,
    cornerRadius: Dp = 0.dp,
    onClick: () -> Unit,
    @StringRes textId: Int,
    textStyle: TextStyle
    ){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        shape = RoundedCornerShape(cornerRadius)
    ) {
        Text(
            text = stringResource(id = textId),
            style = textStyle
        )
    }
}


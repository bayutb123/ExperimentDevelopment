package com.bayutb123.experimentdevelopment.components.input

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bayutb123.experimentdevelopment.ui.theme.ExperimentDevelopmentTheme

@Composable
fun FullWidthButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    Button(
        shape = RoundedCornerShape(MaterialTheme.shapes.medium.topStart),
        onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = text, textAlign = TextAlign.Center, modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp))
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewFullWidthButton() {
    ExperimentDevelopmentTheme {
        Column {
            FullWidthButton(onClick = { /*TODO*/ }, text = "Login")
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                FullWidthButton(modifier = Modifier.weight(1f), onClick = { /*TODO*/ }, text = "Test")
                Spacer(modifier = Modifier.width(8.dp))
                FullWidthButton(modifier = Modifier.weight(1f), onClick = { /*TODO*/ }, text = "Test")
            }
        }
    }
}
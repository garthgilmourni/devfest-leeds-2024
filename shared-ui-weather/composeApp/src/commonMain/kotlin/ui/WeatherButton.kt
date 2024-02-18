package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import country.CapitalInfo

@Composable
fun WeatherButton(
    modifier: Modifier = Modifier,
    capitals: List<String>,
    capitalInfo: CapitalInfo
) {
    val navigator = LocalNavigator.currentOrThrow

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            capitals.forEach {
                TextButton(
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black
                    ),
                    onClick = {
                        navigator.push(
                            WeatherScreen(
                                it,
                                capitalInfo.latlng[0],
                                capitalInfo.latlng[1]
                            )
                        )
                    }) {
                    Text(text = "$it weather")
                }
            }
        }
    }
}
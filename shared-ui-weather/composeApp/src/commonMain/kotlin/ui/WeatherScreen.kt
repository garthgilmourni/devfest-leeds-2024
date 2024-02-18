package ui

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

class WeatherScreen(val cityName: String, val lat: Double, val long: Double) : Screen {

    @Composable
    override fun Content() {
        Surface {
            WeatherCard(
                modifier = Modifier,
                cityName = cityName,
                lat = lat,
                long = long
            )
        }
    }
}
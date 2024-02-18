import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.App

val state = WindowState(
    size = DpSize(450.dp, 700.dp),
    position = WindowPosition(200.dp, 100.dp)
)

fun main() = application {
    Window(
        title = "Devfest Weather (Desktop)",
        onCloseRequest = ::exitApplication,
        state = state
    ) {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}
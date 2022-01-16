package ss.composewithaction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ss.composewithaction.ui.theme.ComposeWithActionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithActionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("JetPack")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {  
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val context = ContextAmbient.current
        Button(
            onClick = {
              Toast.makeText(
                  context, 
                  "Welcome to Action Compose", 
                  Toast.LENGTH_LONG
              ).show()
            },
            modifier = Modifier.padding(all = Dp(10F)),
            enabled = true,
            border = BorderStroke(
                width = 1.dp,
                brush = SolidColor(Color.Red)
            ),
            shape = MaterialTheme.shapes.medium,
        ){
            Text(
                text = "Click me", 
                color = Color.White
            )
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeWithActionTheme {
        Greeting("Android")
    }
}
*/

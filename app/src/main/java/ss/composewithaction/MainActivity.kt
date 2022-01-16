package ss.composewithaction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import ss.composewithaction.ui.theme.ComposeWithActionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithActionTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Button(
                            onClick = {},
                            enabled = true,
                        ) {
                            Text(
                                text = "Click me",
                            )
                        }
                    }
                }
            }
        }
    }
}
/*
@Composable
fun Greeting() {  
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeWithActionTheme {
        Greeting("Android")
    }
}
*/

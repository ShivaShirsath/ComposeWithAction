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

import android.graphics.drawable.shapes.*
import android.media.Image
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.*

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
        Button(
            onClick = {
              Toast.makeText(
                  context, 
                  "Welcome to Action Compose", 
                  Toast.LENGTH_LONG
              ).show()
            },
            enabled = true,
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

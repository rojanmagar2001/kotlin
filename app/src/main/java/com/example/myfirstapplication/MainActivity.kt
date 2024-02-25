package com.example.myfirstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstapplication.ui.theme.MyFirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreviewMain()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.universe
                ),
                contentDescription = "Multiverse",
                colorFilter = ColorFilter.tint(
                    color = Color.Cyan,
                    blendMode = BlendMode.ColorDodge
                ),
                modifier = Modifier.size(200.dp)
            )
            Column {
                Text(
                    text = "Title: $name!",
                    modifier = modifier
                )
                Text(text = "Desc: Hello World! How are you?")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.universe
                ),
                contentDescription = "Multiverse",
                colorFilter = ColorFilter.tint(
                    color = Color.Cyan,
                    blendMode = BlendMode.ColorDodge
                ),
                modifier = Modifier.size(200.dp)
            )
            Column {
                Text(
                    text = "Title: $name!",
                    modifier = modifier
                )
                Text(text = "Desc: Hello World! How are you?")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.universe
                ),
                contentDescription = "Multiverse",
                colorFilter = ColorFilter.tint(
                    color = Color.Cyan,
                    blendMode = BlendMode.ColorDodge
                ),
                modifier = Modifier.size(200.dp)
            )
            Column {
                Text(
                    text = "Title: $name!",
                    modifier = modifier
                )
                Text(text = "Desc: Hello World! How are you?")
            }
        }
    }
//    Column {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//        Image(
//            painter = painterResource(
//                id = R.drawable.universe
//            ),
//            contentDescription = "Multiverse",
//            colorFilter = ColorFilter.tint(color = Color.Cyan, blendMode = BlendMode.ColorDodge)
//        )
//        Button(
//            onClick = { /*TODO*/ }, modifier = Modifier
//                .width(100.dp)
//                .height(20.dp)
//        ) {
//            Text(text = "Click Me")
//        }
//    }

}

@Composable
fun GreetingPreview(name: String) {
    MyFirstApplicationTheme {
        Greeting(name)
    }
}


@Preview(showBackground = true)
@Composable
private fun GreetingPreviewMain() {
    GreetingPreview(name = "Android")
}

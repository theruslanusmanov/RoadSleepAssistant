package com.github.theruslanusmanov.roadsleepassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.theruslanusmanov.roadsleepassistant.ui.theme.RoadSleepAssistantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoadSleepAssistantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "profile") {
        composable("map") { Map(/*...*/) }
        composable("finish") { Finish(/*...*/) }
        /*...*/
    }
}

@Composable
fun Title(name: String) {
    Text(text = "$name!", fontWeight = FontWeight.Black)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RoadSleepAssistantTheme {
        Title("Android")
    }
}
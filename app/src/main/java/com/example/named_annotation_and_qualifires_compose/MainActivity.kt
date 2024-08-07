package com.example.named_annotation_and_qualifires_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.named_annotation_and_qualifires_compose.ui.theme.Named_Annotation_and_Qualifires_composeTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
   lateinit var userResistaionService:UserResistaionService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Named_Annotation_and_Qualifires_composeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    val consumer = DaggerConsumerComponent.builder().build()
                    consumer.injectMainAC(this)
                    userResistaionService.resisterUser("","")
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Named_Annotation_and_Qualifires_composeTheme {

    }
}
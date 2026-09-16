package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme
import com.example.composedemo.ui.theme.DemoScreen
import com.example.composedemo.ui.theme.DemoText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Preview
@Composable
fun DemoTextPreview() {
    ComposeDemoTheme() {
        Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding->
            DemoScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}


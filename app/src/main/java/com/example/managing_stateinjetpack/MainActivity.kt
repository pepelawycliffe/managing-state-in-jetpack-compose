package com.example.managing_stateinjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.managing_stateinjetpack.ui.presentation.model.StateViewModel
import com.example.managing_stateinjetpack.ui.presentation.screen.FastState
import com.example.managing_stateinjetpack.ui.theme.ManagingStateInJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val ViewModel = ViewModelProvider(this)[StateViewModel::class.java]
        setContent {
            FastState(ViewModel)
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ManagingStateInJetpackTheme {
//        Greeting("Android")
//    }
//}
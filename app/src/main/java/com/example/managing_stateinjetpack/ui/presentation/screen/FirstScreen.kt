package com.example.managing_stateinjetpack.ui.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.managing_stateinjetpack.ui.theme.ManagingStateInJetpackTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FastState(){
//    remember persist state on recomposition
//    rememberSaveable persist even on configaration change
    var name by rememberSaveable {
        mutableStateOf("")
    }
    Scaffold (topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(text = "Managing State")})}){
        paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)) {

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(
                                0xFFCECFBB
                            ), Color(0xFF5A7C76)
                        )
                    )
                )
        ){

            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                MyText(name)
                MyTextField(name,onNameChange={name=it})
            }
//            Content here


        }
    }
}
@Composable
fun MyText(name:String){
    Text(text = "Hello $name", style = TextStyle(fontSize = 30.sp))
}
@Composable
fun MyTextField(name:String,onNameChange:(String)->Unit){
    OutlinedTextField(value = name ,
        onValueChange ={onNameChange(it)} )
}

@Preview(showBackground = true)
@Composable
fun FastStatePreview() {
    ManagingStateInJetpackTheme {
        FastState()
    }
}
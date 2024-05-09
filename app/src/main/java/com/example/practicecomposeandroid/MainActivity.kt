package com.example.practicecomposeandroid

import FoodColumnLists
import FoodRowLists
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildLists()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun BuildLists() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White
                ),
                title = {
                Text(text = "List View App Bar")
            },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Icon",
                            tint = Color.White)
                    }
                })
        }
    ) { paddingValues ->  BuildListContent(paddingValues)
    }
}

@Composable
fun BuildListContent(paddingValues: PaddingValues) {
    Column(modifier = Modifier.padding(10.dp)) {
        Box(modifier = Modifier.fillMaxHeight(0.5f)) {
           FoodColumnLists(paddingValues = paddingValues)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .fillMaxHeight(1f)
            .background(Color.Transparent)) {
            FoodRowLists()
        }
    }
}


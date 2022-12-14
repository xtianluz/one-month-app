package com.example.one_month_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.one_month_app.model.DayData
import com.example.one_month_app.model.DayList.day
import com.example.one_month_app.ui.theme.OneMonthAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneMonthAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DayPost()
                }
            }
        }
    }
}


@Composable
fun DayPost(){
    Scaffold() {
        LazyColumn(){
            items(day){
                DayItem(dayData = it)
            }
        }
    }
}

@Composable
fun DayItem(dayData: DayData){
    Card(
        elevation = 6.dp,
        modifier = Modifier
            .padding(16.dp)
    ){
       Column(modifier = Modifier
           .padding(16.dp)
           .fillMaxWidth(),
           horizontalAlignment = Alignment.Start,
           verticalArrangement = Arrangement.spacedBy(8.dp)
       ) {
           Text(text = stringResource(dayData.dayRes), style = MaterialTheme.typography.h3)
           Text(text = stringResource(dayData.goalRes), style = MaterialTheme.typography.h2)
           Image(
               painter = painterResource(dayData.imageRes),
               contentDescription = null,
               modifier = Modifier
                   .fillMaxWidth()
                   .height(260.dp),
               contentScale = ContentScale.FillWidth

           )
           Text(
               text = stringResource(dayData.descriptionRes),
               textAlign = TextAlign.Justify,
               style = MaterialTheme.typography.body1
           )
       }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    OneMonthAppTheme {
        DayPost()
    }
}
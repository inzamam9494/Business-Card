package com.example.buisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.DakrGreen70
import com.example.buisnesscard.ui.theme.Green80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun BusinessCard(){

    Column(
        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Green80)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(.4f)
                .fillMaxSize()
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "card"
                )
            }
            Text(
                text = "Mohd Inzamam Ahmad",
                fontWeight = FontWeight.Thin,
                fontSize = 30.sp
            )
            Text(text = "Android Developer Extraodinary",
                fontWeight = FontWeight.Bold,
                color = DakrGreen70
                )
        }

        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(.1f)
                .fillMaxSize()
            ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                ) {
                Row {
                    Icon(
                        imageVector = Icons.Rounded.Phone,
                        contentDescription = "phone",
                        modifier = Modifier
                            .padding(8.dp),
                        tint = DakrGreen70
                    )
                    Text(text = "98891-58546",
                        modifier = Modifier
                            .padding(8.dp))
                }
                Row {
                    Icon(
                        imageVector = Icons.Rounded.Share,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(8.dp),
                        tint = DakrGreen70
                    )

                    Text(text = "@inzamam9494",
                        modifier = Modifier
                            .padding(8.dp)
                    )

                }
                Row {
                    Icon(
                        imageVector = Icons.Rounded.Email,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(8.dp),
                        tint = DakrGreen70
                    )
                    Text(text = "mohdinzamam12125@gmail.com",
                        modifier = Modifier
                            .padding(8.dp)
                        )
                }
            }
        }
    }

}
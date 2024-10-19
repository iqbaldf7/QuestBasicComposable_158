package com.example.pertemuanbasiccompos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuanbasiccompos.ui.theme.PertemuanBasicComposTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PertemuanBasicComposTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColum(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun BasicColum(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()

            .padding(top = 50.dp)) {
        Text ( "Login",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(10.dp))
        Text( text = "Ini Adalah Halaman Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.padding(20.dp))
        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.size(250.dp)
        )


        Text( "Nama",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal)
        Spacer(modifier = Modifier.padding(5.dp))
        Text( text = " Iqbal Dwi Fathonah ",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Red)


        Text( " 20220140158 ",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(20.dp))

        Image(painter = painterResource(id = R.drawable.gambarku),
            contentDescription = "")



    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PertemuanBasicComposTheme {
        Greeting("Android")
    }
}
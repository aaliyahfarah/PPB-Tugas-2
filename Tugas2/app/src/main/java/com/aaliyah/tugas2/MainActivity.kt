package com.aaliyah.tugas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.aaliyah.tugas2.ui.theme.Tugas2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Greeting("Aaliyah Farah Adibah", "5025201070", "PPB-I")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, nrp: String, kelas: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Hello $name!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
        )
        Text(
            text = "Nrp: $nrp",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
        )

        Text(text = "Ini untuk tugas kelas $kelas")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas2Theme {
        Greeting("Aaliyah Farah Adibah","5025201075", "PPB-I")
    }
}
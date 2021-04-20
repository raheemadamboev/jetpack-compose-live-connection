package xyz.teamgravity.liveconnection

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    lateinit var connectionLiveData: ConnectionLiveData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        connectionLiveData = ConnectionLiveData(this)

        setContent {

            val connection = connectionLiveData.observeAsState(false).value

            Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(text = "It detects connection live, so try to turn off your connection!")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text(
                            text = if (connection) "Connected" else "No connection",
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Image(
                            imageVector = if (connection) Icons.Filled.Done else Icons.Filled.Close,
                            contentDescription = "raheem",
                            colorFilter = if (connection) ColorFilter.tint(Color.Green) else ColorFilter.tint(Color.Red)
                        )
                    }
                }
            }
        }
    }
}
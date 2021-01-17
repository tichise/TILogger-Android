package tichise.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tichise.tilogger.TILogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TILogger.debug("test")
    }
}
package tichise.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tichise.TILogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TILogger().debug("test1")

        TILogger().setPrefix("TILogger2").verbose("test")
        TILogger().setPrefix("TILogger2").debug("test")
        TILogger().setPrefix("TILogger2").info("test")
        TILogger().setPrefix("TILogger2").warining("test")
        TILogger().setPrefix("TILogger2").error("test")
    }
}
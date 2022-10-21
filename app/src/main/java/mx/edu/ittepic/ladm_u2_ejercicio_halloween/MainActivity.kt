package mx.edu.ittepic.ladm_u2_ejercicio_halloween

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var h = ""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
        h = window.decorView.height.toString()
    }
    object pantalla {
        var height = h
    }
}
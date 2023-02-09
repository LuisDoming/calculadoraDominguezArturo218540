package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val btn0: Button = findViewById(R.id.btn0)
    val btn1: Button = findViewById(R.id.btn1)
    val btn2: Button = findViewById(R.id.btn2)
    val btn3: Button = findViewById(R.id.btn3)
    val btn4: Button = findViewById(R.id.btn4)
    val btn5: Button = findViewById(R.id.btn5)
    val btn6: Button = findViewById(R.id.btn6)
    val btn7: Button = findViewById(R.id.btn7)
    val btn8: Button = findViewById(R.id.btn7)
    val btnsuma: Button = findViewById(R.id.btnSumar)
    val btnresta: Button = findViewById(R.id.btnRestar)
    val btndivision: Button = findViewById(R.id.btnDividir)
    val btnmultiplicacion: Button = findViewById(R.id.btnMultiplicar)
    val btnResultado: Button = findViewById(R.id.btnresultado)
    val btnBorrar: Button = findViewById(R.id.btnborrar)
    val txResultado: TextView = findViewById(R.id.resultado)
    val txOperacion: TextView = findViewById(R.id.operacion)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
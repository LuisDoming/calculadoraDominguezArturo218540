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
    val btn8: Button = findViewById(R.id.btn8)
    val btn9: Button = findViewById(R.id.btn9)
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

        btn0.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'0')
        }

        btn1.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'1')
        }

        btn2.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'2')
        }

        btn3.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'3')
        }

        btn4.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'4')
        }

        btn5.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'5')
        }

        btn6.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'6')
        }

        btn7.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'7')
        }

        btn8.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'8')
        }

        btn9.setOnClickListener{
            txOperacion.setText(txOperacion.text.toString()+'9')
        }

        btnResultado.setOnClickListener{
            var operador: Char = txResultado.text.toString().last()
            var numero: String = txResultado.text.toString().dropLast(1)
            var numeroArriba: Float = numero.toFloat()
            var numeroAbajo: Float = txResultado.text.toString().toFloat()

            var resultado: Float = 0f
            when (operador) {
                '+' -> resultado = numeroArriba+numeroAbajo
                '-' -> resultado = numeroArriba-numeroAbajo
                '/' -> resultado = numeroArriba/numeroAbajo
                '*' -> resultado = numeroArriba*numeroAbajo
                else->{ // Note the block
                    txResultado.setText("error")
                    txOperacion.setText("switch")
                }
            }

            txOperacion.setText(resultado.toString())
            txResultado.setText("")
        }

        btnBorrar.setOnClickListener{
            txOperacion.setText("")
            txResultado.setText("")
        }

        btnsuma.setOnClickListener {
            if (txResultado.text.toString().equals("", true)) {
                txResultado.setText(txOperacion.text.toString() + '+')
                txOperacion.setText("")
            } else {
                btnResultado.performClick()

                txResultado.setText(txOperacion.text.toString()+'+')
                txOperacion.setText("")
            }
        }

        btndivision.setOnClickListener{
            if(txResultado.text.toString().equals("",true)){
                txResultado.setText(txOperacion.text.toString()+'/')
                txOperacion.setText("")
            }else{
                btnResultado.performClick()
                txResultado.setText(txOperacion.text.toString()+'/')
                txOperacion.setText("")
            }
        }

        btnresta.setOnClickListener{
            if(txResultado.text.toString().equals("",true)){
                txResultado.setText(txOperacion.text.toString()+'-')
                txOperacion.setText("")
            }else{
                btnResultado.performClick()
                txResultado.setText(txOperacion.text.toString()+'-')
                txOperacion.setText("")
            }
        }

        btnmultiplicacion.setOnClickListener{
            if(txResultado.text.toString().equals("",true)){
                txResultado.setText(txOperacion.text.toString()+'*')
                txOperacion.setText("")
            }else{
                btnResultado.performClick()
                txResultado.setText(txOperacion.text.toString()+'*')
                txOperacion.setText("")

            }
        }
    }
}
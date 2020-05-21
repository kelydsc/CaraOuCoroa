package br.com.kely.caraoucoroa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJogar.setOnClickListener {

            //chama a tela de Resultado
            val intentJogar = Intent(applicationContext, ResultadoMoedaActivity::class.java)

            //Gera numero randomico de 0 a 1(exceto o numero 2)
            var resultadoMoeda = Random().nextInt(2)

            intentJogar.putExtra("Moeda", resultadoMoeda)

            startActivity(intentJogar)
        }
    }
}

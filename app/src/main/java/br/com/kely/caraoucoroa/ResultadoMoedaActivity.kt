package br.com.kely.caraoucoroa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado_moeda.*

class ResultadoMoedaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_moeda)

        //recuperando o numero randômico
        val resultadoMoeda: Bundle? = intent.extras

        val moeda = resultadoMoeda?.getInt("Moeda")

        //valida e carrega a imagem do Res drawable
        if (moeda == 0) {
            imageViewResultadoMoeda.setImageResource(R.drawable.moeda_cara)
        } else {
            imageViewResultadoMoeda.setImageResource(R.drawable.moeda_coroa)
        }

        buttonVoltar.setOnClickListener {

            /*
            //chama a Tela anterior
            val intentVoltar = Intent(applicationContext, MainActivity::class.java)

            startActivity(intentVoltar)
            */

            //OU para não empilhar as Activities pode destruir(finalizar) a Activity Resultado que
            //não será mais utilizada
            finish()

        }

    }
}

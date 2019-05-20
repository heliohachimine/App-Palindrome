package com.example.palindromo.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.palindromo.Palindromo
import com.example.palindromo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :
    AppCompatActivity(),
    View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verify.setOnClickListener(this)
        tv_resposta.text = ""
    }

    override fun onClick(v: View?) {
        val palindromo = Palindromo(et_string.text.toString())
        var resposta : String

        resposta = if(palindromo.ehPalindromo()) {
            "${palindromo.conteudo} é um palindromo"
        } else
            "${palindromo.conteudo} NÃO é palindromo"
        tv_resposta.text = resposta
    }
}

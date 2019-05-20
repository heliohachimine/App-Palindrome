package com.example.palindromo

data class Palindromo constructor( var _conteudo: String ){
    val conteudo: String = _conteudo
        get(){
            return field.toLowerCase()
        }
    fun ehPalindromo() : Boolean{
        return conteudo == conteudo.reversed()
    }
}
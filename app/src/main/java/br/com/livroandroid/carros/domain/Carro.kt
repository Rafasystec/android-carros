package br.com.livroandroid.carros.domain

import java.io.Serializable

/**
 * Created by root on 23/01/18.
 */
class Carro : Serializable{
    var id: Long = 0
    var tipo = ""
    var nome = ""
    var desc = ""
    var urlFoto = ""
    var urlInfo = ""
    var urlVideo = ""
    var latitude = ""
    var longitude = ""

    override fun toString(): String {
        return "Carro(nome='$nome')"
    }
}
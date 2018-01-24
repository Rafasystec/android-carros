package br.com.livroandroid.carros.domain

/**
 * Created by root on 23/01/18.
 */
class Carro {
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
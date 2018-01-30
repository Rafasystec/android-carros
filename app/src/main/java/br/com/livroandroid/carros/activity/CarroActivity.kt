package br.com.livroandroid.carros.activity

import android.os.Bundle
import br.com.livroandroid.carros.R
import br.com.livroandroid.carros.domain.Carro
import br.com.livroandroid.carros.extensions.loadUrl
import br.com.livroandroid.carros.extensions.setupToolbar
import br.com.livroandroid.carros.fragments.MapsFragment
import kotlinx.android.synthetic.main.activity_carro_content.*

class CarroActivity : BaseActivity() {
    val carro by lazy { intent.getSerializableExtra("carro") as Carro }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carro)
        //Lê o carro enviado como parametro
        //carro = intent.getSerializableExtra("carro") as Carro
        //Seta o nome do carro como título da toolbar
        setupToolbar(R.id.toolbar, carro.nome, true)
        //Atualizar os dados do carro na tela
        initViews()
    }

    private fun initViews() {
        //Variaveis geradas automaticamente pelo kotlin Extension
        tDesc.text = carro.desc
        img.loadUrl(carro.urlFoto)
        //adicionar o mapa
        val mapaFragment = MapsFragment()
        mapaFragment.arguments = intent.extras
        supportFragmentManager.beginTransaction().replace(R.id.mapaFragment,mapaFragment)
                .commit()
    }

}

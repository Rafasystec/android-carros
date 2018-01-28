package br.com.livroandroid.carros.adapter

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.livroandroid.carros.domain.TipoCarro
import br.com.livroandroid.carros.fragments.CarrosFragment

/**
 * Created by root on 27/01/18.
 */
class TabsAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm){
    override fun getCount(): Int = 3
    //retorna o tipo de posicao
    fun getTipoCarro(position: Int) = when(position){
        0 -> TipoCarro.classicos
        1 -> TipoCarro.esportivos
        else -> TipoCarro.luxo
    }

    override fun getPageTitle(position: Int): CharSequence {
        val tipo = getTipoCarro(position)
        return context.getString(tipo.string)
    }

    override fun getItem(position: Int): Fragment {
        val tipo = getTipoCarro(position)
        val f:Fragment = CarrosFragment()
        with(f){
            arguments = Bundle()
            arguments.putSerializable("tipo",tipo)
        }
        return f
    }
}

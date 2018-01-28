package br.com.livroandroid.carros.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import br.com.livroandroid.carros.R
import br.com.livroandroid.carros.domain.Carro
import br.com.livroandroid.carros.extensions.loadUrl
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_carro.view.*

/**
 * Created by root on 23/01/18.
 */
class CarroAdpter(val carros: List<Carro>,
                  val onClick: (Carro) -> Unit):
RecyclerView.Adapter<CarroAdpter.CarrosViewHolder>(){
    class CarrosViewHolder(view : View) : RecyclerView.ViewHolder(view){
    }

    override fun getItemCount() = this.carros.size
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CarrosViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_carro,parent,false)
        return  CarrosViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarrosViewHolder, position: Int) {
        //recupera o objeto carro
        val carro = carros[position]
        //Declara a variável view para facilitar o acesso abaixo
        //A view contém as variáveis definidas no XML (lembre do nome de cada id)
        val view = holder.itemView
        //updates the car data
        with(carro) {
            view.tNome.text = nome
            view.img.loadUrl(urlFoto, view.progress)
            view.setOnClickListener { onClick(this) }
        }
    }
}
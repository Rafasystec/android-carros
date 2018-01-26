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
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_carro.view.*

/**
 * Created by root on 23/01/18.
 */
class CarroAdpter(val carros: List<Carro>,
                  val onClick: (Carro) -> Unit):
RecyclerView.Adapter<CarroAdpter.CarrosViewHolder>(){
    class CarrosViewHolder(view : View) : RecyclerView.ViewHolder(view){
        //TODO: Check if I made some change at home
        //var tNome : TextView
        var img: ImageView = view.findViewById(R.id.img)
        var progress: ProgressBar
        var cardView: CardView
        init {
            //Saves view on view holder
            //tNome       = view.findViewById<TextView>(R.id.tNome)
            progress    = view.findViewById<ProgressBar>(R.id.progress)
            cardView    = view.findViewById<CardView>(R.id.card_view)
        }
    }

    override fun getItemCount() = this.carros.size
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CarrosViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_carro,parent,false)
        val holder = CarrosViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: CarrosViewHolder?, position: Int) {
        val context = holder?.itemView?.context
        //recupera o objeto carro
        val carro = carros[position]
        //updates the car data
        //holder?.tNome?.text = carro.nome
        holder?.progress?.visibility = View.VISIBLE
        Picasso.with(context).load(carro.urlFoto).fit().into(holder?.img,
                object : com.squareup.picasso.Callback{
                    override fun onSuccess() {
                        //Download OK
                        holder?.progress?.visibility = View.GONE
                    }

                    override fun onError() {
                        holder?.progress?.visibility = View.GONE
                    }
                }
        )
        holder?.itemView?.setOnClickListener{ onClick(carro)}
    }
}
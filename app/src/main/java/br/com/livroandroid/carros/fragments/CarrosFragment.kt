package br.com.livroandroid.carros.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.livroandroid.carros.R
import br.com.livroandroid.carros.activity.CarroActivity
import br.com.livroandroid.carros.adapter.CarroAdpter
import br.com.livroandroid.carros.domain.Carro
import br.com.livroandroid.carros.domain.CarroService
import br.com.livroandroid.carros.domain.TipoCarro
import br.com.livroandroid.carros.extensions.toast
import kotlinx.android.synthetic.main.fragment_carros.*
import org.jetbrains.anko.startActivity

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [CarrosFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [CarrosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CarrosFragment : BaseFragment(){


    private var tipo: TipoCarro = TipoCarro.classicos
    private var carros = listOf<Carro>()
    //var recyclerView : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tipo = arguments.getSerializable("tipo") as TipoCarro
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_carros,container,false)
        val textView = view?.findViewById<TextView>(R.id.text)
        val tipoString = getString(tipo.string)
        textView?.text = "Carros $tipoString"
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(activity)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        taskCarros()
    }

    fun taskCarros(){
        //BUsca os carros
        this.carros = CarroService.getCarros(context,tipo)
        //updates the list
        recyclerView?.adapter = CarroAdpter(carros){onClickCarro(it)}
    }
    fun onClickCarro(carro:Carro){
        //toast("Clicou no carro ${carro.nome}")
        //Ao clicar no carro vamos navegar para a tela de detalhes
        activity.startActivity<CarroActivity>("carro" to carro)
    }

}

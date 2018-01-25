package br.com.livroandroid.carros.extensions

/**
 * Created by root on 24/01/18.
 */
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.widget.Toast
fun Fragment.toast(message: CharSequence,length : Int = Toast.LENGTH_SHORT) =
        Toast.makeText(activity,message,length).show()
fun Fragment.toast(@StringRes message: Int, length : Int = Toast.LENGTH_SHORT) =
        Toast.makeText(activity,message,length).show()

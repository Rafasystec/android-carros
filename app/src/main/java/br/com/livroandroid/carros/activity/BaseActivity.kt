package br.com.livroandroid.carros.activity

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

/**
 * Created by idoctor on 19/01/2018.
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(){
    //Guithub
    //THIS IS FOR FIX SOME PROBLEMS IN SPRINT 1.5
    protected val context: Context get() = this

}
package br.com.livroandroid.carros.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar

import android.view.MenuItem
import br.com.livroandroid.carros.R
import br.com.livroandroid.carros.extensions.setupToolbar
import br.com.livroandroid.carros.extensions.toast


class MainActivity : BaseActivity() {//, NavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setupToolbar(R.id.toolbar)
       //setupNavDrawer()
    }
/*
    private fun setupNavDrawer(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }
    */
/*
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_item_carros_todos -> {
                toast("Clicked on Cars")
            }
            R.id.nav_item_carros_classicos -> {
                toast("Clicked on Classic Cars")
            }
            R.id.nav_item_carros_esportivos -> {
                toast("Clicked on Sportive Cars")
            }
            R.id.nav_item_carros_luxo -> {
                toast("Clicked on lux Cars")
            }
            R.id.nav_item_site_livro -> {
                toast("Clicked on Book's home page")
            }
            R.id.nav_item_settings -> {
                toast("Clicked on configurations")
            }
        }
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
    */
}
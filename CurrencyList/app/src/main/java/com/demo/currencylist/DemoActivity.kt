package com.demo.currencylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.currencylist.fragment.CurrencyListFragment

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = CurrencyListFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}
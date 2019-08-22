package br.ufrn.eaj.tads.exemplogerenciadoreslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        /*
        for (i in 1..100){
            var text = TextView(this)
            text.setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT))
            text.text = "Texto $i"
            principal.addView(text)
        }
        */

        for (i in 1..100){
            val inflater = LayoutInflater.from(this)
            val tv = inflater.inflate(R.layout.infla_texto, principal, false) as TextView
            tv.text = "Texto com Inflater $i"
            principal.addView(tv)
        }


    }
}

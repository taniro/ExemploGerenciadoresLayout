package br.ufrn.eaj.tads.exemplogerenciadoreslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            button.visibility = View.GONE
        }
    }
}

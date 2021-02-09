package br.ufrn.eaj.tads.exemplogerenciadoreslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class Main2Activity : AppCompatActivity() {

    lateinit var progressBar:ProgressBar
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        progressBar = findViewById(R.id.progressbar)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            button.visibility = View.GONE
        }
    }
}

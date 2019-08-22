package br.ufrn.eaj.tads.exemplogerenciadoreslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var layout = LinearLayout(this)
        with (layout){
            setPadding(10, 10, 10, 10)
            setOrientation(LinearLayout.VERTICAL)
            setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT))
        }

        var text = TextView(this)
        with(text){
            setText("Nome:")
            setLayoutParams(LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        }

        layout.addView(text)
        setContentView(layout)
    }
}

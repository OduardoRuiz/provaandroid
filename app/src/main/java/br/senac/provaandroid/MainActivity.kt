package br.senac.provaandroid

import android.app.ProgressDialog.show
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDialog = findViewById<Button>(R.id.buttonDialog)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)


        buttonDialog.setOnClickListener {

            var msg = """nome: ${editText1.text}
                |sobrenome: ${editText2.text}
               
                
                
            """.trimMargin()

            alert("Oi", "Olá ${editText1.text} ${editText2.text}",   this)

        }


    }




}
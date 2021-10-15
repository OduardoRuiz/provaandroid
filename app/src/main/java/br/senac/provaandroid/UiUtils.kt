package br.senac.provaandroid

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun alert(titulo: String, msg: String, ctx: Context) {
    AlertDialog.Builder(ctx)
        .setTitle(titulo)
        .setMessage(msg)
        .setPositiveButton("OK", null)
        .create()
        .show()
}
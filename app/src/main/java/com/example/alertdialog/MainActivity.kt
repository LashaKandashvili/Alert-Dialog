package com.example.alertdialog

import android.content.DialogInterface
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        override fun onBackPressed (){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("უეჭველი ძმა?!")
            builder.setMessage("ნაღდად გინდა დახურვა? უეჭველი?????")
            builder.setPositiveButton("კი", { dialogInterface: DialogInterface, i: Int ->
                finish()
            })
            builder.setNegativeButton("არა", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()

        }
    }
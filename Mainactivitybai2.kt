Mainactivity.kt

package com.example.bai2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bai2.databinding.MainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bind = MainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.bt1.setOnClickListener {
            val t1 = bind.edTt2.text.toString()
            val t2 = bind.edTt3.text.toString()
            val t3 = bind.edTt4.text.toString()

            var t4 = true
            if (bind.rg1.checkedRadioButtonId == bind.rb2.id) t4 = false
            val intent = Intent(this, MainActivity2::class.java)
            val t5 = bind.edTt1.text.toString()
            intent.putExtra("t1", t1)
            intent.putExtra("t2", t2)
            intent.putExtra("t3", t3)
            intent.putExtra("t4", t4)
            intent.putExtra("t5", t5)
            startActivity(intent)
        }
        bind.bt2.setOnClickListener {
            finish()
            startActivity(intent)
        }

    }
}

package kr.ac.kopo.m1nj00.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var btnNaver : Button
    lateinit var btn911 : Button
    lateinit var btnGallery : Button
    lateinit var btnFinish : Button
//    var mintent = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btnNaver = findViewById(R.id.buttonNaver)
        btn911 = findViewById(R.id.button911)
        btnGallery = findViewById(R.id.buttonGallery)
        btnFinish = findViewById(R.id.buttonFinish)

//        when(btn){
//            btn_2 -> mintent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
//            btn_3 -> mintent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
//            btn_4 -> mintent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
//            btn_5 -> mintent = ""
//        }

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "기분 좋은 오후입니다 :)", Toast.LENGTH_SHORT).show()
        }
        btnNaver.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")))
        }
        btn911.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911")))
        }
        btnGallery.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media")))
        }
        btnFinish.setOnClickListener {
            finish()
        }
    }
}
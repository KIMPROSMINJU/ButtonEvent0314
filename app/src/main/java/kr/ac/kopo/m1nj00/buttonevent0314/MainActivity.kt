package kr.ac.kopo.m1nj00.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var btnNaver : Button
    lateinit var btn911 : Button
    lateinit var btnGallery : Button
    lateinit var btnFinish : Button
    lateinit var btnListner : View.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btnNaver = findViewById(R.id.buttonNaver)
        btn911 = findViewById(R.id.button911)
        btnGallery = findViewById(R.id.buttonGallery)
        btnFinish = findViewById(R.id.buttonFinish)

        btnListner = View.OnClickListener { // 클릭이 되었을 때의 참조값이 it에 들어옴!
            when(it.id){
                R.id.buttonNaver -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
                R.id.button911 -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
                R.id.buttonGallery -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            }
            startActivity(intent)
        }

        btnNaver.setOnClickListener(btnListner)
        btn911.setOnClickListener(btnListner)
        btnGallery.setOnClickListener(btnListner)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "기분 좋은 오후입니다 :)", Toast.LENGTH_SHORT).show()
        }
//        btnNaver.setOnClickListener {
//            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")))
//        }
//        btn911.setOnClickListener {
//            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911")))
//        }
//        btnGallery.setOnClickListener {
//            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media")))
//        }
        btnFinish.setOnClickListener {
            finish()
        }
    }
}
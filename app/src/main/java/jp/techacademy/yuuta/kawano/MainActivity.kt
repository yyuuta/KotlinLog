package jp.techacademy.yuuta.kawano

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kawano1 = Human("川野ゆうた", 38,"野球観戦")      // 名前と趣味
        kawano1.say()
        kawano1.think()
        val kawano2 = Human("カワノユウタ", 38,"日本の未来")  //名前と趣味
        kawano2.say()
        kawano2.think()
    }
}
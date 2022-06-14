package dev.lotus.brandapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    var imgFace = ImageView
//    var tvFace = TextView()

//    variables
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
    var bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

    var img: ImageView = findViewById(R.id.imgFace)
    var tvFace: TextView = findViewById(R.id.tvFace)

    img.setAnimation(topAnim)
    tvFace.setAnimation(bottomAnim)

    Handler().postDelayed({
        val intent = Intent(this,DashboadActivity::class.java)
        startActivity(intent)
        finish()
    },5000)


    }
}
package com.android.uraall.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class ScaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale)
    }

    fun startAnimation(view: View) {
        
//        startScaleAnimation()
        startTranslateAnimation()
        
    }

    private fun startScaleAnimation() {

        val scaleAnimation = AnimationUtils.loadAnimation(this,
            R.anim.scale_animaton)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.startAnimation(scaleAnimation)

    }

    private fun startTranslateAnimation() {

        val translateAnimation = AnimationUtils.loadAnimation(this,
            R.anim.translate_animation)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.startAnimation(translateAnimation)

    }
}
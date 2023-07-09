package com.example.scrollviewex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView


class VerticalScrollview : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical_scrollview)

        val scrollView = ScrollView(this)
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT)
        scrollView.layoutParams = layoutParams

        val linearLayout = LinearLayout(this)
        val linearParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.layoutParams = linearParams

        scrollView.addView(linearLayout)

        val imageView1 = ImageView(this)
        val params1 = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        //setting margin
        params1.setMargins(0, 10, 0, 10)

        //aligning the layout to center of the screen
        params1.gravity = Gravity.CENTER
        imageView1.layoutParams = params1

        //setting our own downloaded/custom image to the imageView
        imageView1.setImageResource(R.drawable.image1)
        linearLayout.addView(imageView1)

        val imageView2 = ImageView(this)
        val params2 = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        params2.setMargins(0, 10, 0, 10)
        params2.gravity = Gravity.CENTER
        imageView2.layoutParams = params2
        imageView2.setImageResource(R.drawable.image2)
        linearLayout.addView(imageView2)

        val imageView3 = ImageView(this)
        val params3 = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        params3.setMargins(0, 10, 0, 10)
        params3.gravity = Gravity.CENTER
        imageView3.layoutParams=params3
        imageView3.setImageResource(R.drawable.image3)
        linearLayout.addView(imageView3)

        val imageView4 = ImageView(this)
        val params4 = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        params4.setMargins(0, 0, 0, 10)
        params4.gravity = Gravity.CENTER
        imageView4.layoutParams=params4
        imageView4.setImageResource(R.drawable.image4)
        linearLayout.addView(imageView4)

        val linearLayout1 = findViewById<LinearLayout>(R.id.layout)
        linearLayout1?.addView(scrollView)

    }
}
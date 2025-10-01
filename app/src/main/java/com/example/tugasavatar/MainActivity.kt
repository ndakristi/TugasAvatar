package com.example.tugasavatar

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare ImageViews
    private lateinit var imgHead: ImageView
    private lateinit var imgMouth: ImageView
    private lateinit var imgEyes: ImageView
    private lateinit var imgEyebrow: ImageView
    private lateinit var imgNose: ImageView

    // Declare CheckBoxes
    private lateinit var cbHead: CheckBox
    private lateinit var cbMouth: CheckBox
    private lateinit var cbEyes: CheckBox
    private lateinit var cbEyebrow: CheckBox
    private lateinit var cbNose: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ImageViews
        imgHead = findViewById(R.id.imgHead)
        imgMouth = findViewById(R.id.imgMouth)
        imgEyes = findViewById(R.id.imgEyes)
        imgEyebrow = findViewById(R.id.imgEyebrow)
        imgNose = findViewById(R.id.imgNose)

        // Initialize CheckBoxes
        cbHead = findViewById(R.id.cbHead)
        cbMouth = findViewById(R.id.cbMouth)
        cbEyes = findViewById(R.id.cbEyes)
        cbEyebrow = findViewById(R.id.cbEyebrow)
        cbNose = findViewById(R.id.cbNose)

        // Set CheckBox Listeners
        cbHead.setOnCheckedChangeListener { _, isChecked ->
            imgHead.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbMouth.setOnCheckedChangeListener { _, isChecked ->
            imgMouth.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbEyes.setOnCheckedChangeListener { _, isChecked ->
            imgEyes.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbEyebrow.setOnCheckedChangeListener { _, isChecked ->
            imgEyebrow.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbNose.setOnCheckedChangeListener { _, isChecked ->
            imgNose.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
    }
}
package com.ahmetutlu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmetutlu.recyclerviewlandmarkupdated.databinding.ActivityDetailsBinding

private lateinit var binding: ActivityDetailsBinding
class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent
        //casting
        //val selectedLandMark=intent.getSerializableExtra("landmark") as LandMark

        val selectedLandMark=mySingleton.choosenLandMark

        selectedLandMark?.let {

            binding.nameText.text=it.name
            binding.countryText.text=it.coutry
            binding.imageView.setImageResource(it.image)

        }

    }
}
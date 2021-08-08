package com.ahmetutlu.recyclerviewlandmarkupdated

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmetutlu.DetailsActivity
import com.ahmetutlu.LandMark
import com.ahmetutlu.recyclerviewlandmarkupdated.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var LandMarkList:ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        LandMarkList=ArrayList<LandMark>()

        //data
                                            // burdaki R.dravable resmin bulunmasına yarar
        val istanbul=LandMark("İstanbul","Turkey",R.drawable.istanbul)
        val adana=LandMark("Adana","Turkey",R.drawable.adana)
        val izmir=LandMark("İzmir","Turkey",R.drawable.izmir)
        val trabzon=LandMark("Trabzon","Turkey",R.drawable.trabzon)

        LandMarkList.add(istanbul)
        LandMarkList.add(adana)
        LandMarkList.add(izmir)
        LandMarkList.add(trabzon)

        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)//adapter'ın altalta olcağını belirler
        val adapter = LandmarkAdapter(LandMarkList)//landmarkListi adapterda göstermeye yarar
        binding.recyclerView.adapter = adapter



    }
}
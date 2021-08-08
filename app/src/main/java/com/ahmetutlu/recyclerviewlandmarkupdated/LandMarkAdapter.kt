package com.ahmetutlu.recyclerviewlandmarkupdated

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetutlu.DetailsActivity
import com.ahmetutlu.LandMark
import com.ahmetutlu.mySingleton
import com.ahmetutlu.recyclerviewlandmarkupdated.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<LandMark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    //ViewHolder oluşturuldak sonra ne olacağını belirler(yaptığımız recyler_row layoutunu burda bağlıyoruz)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    //bağlandıktan sonra hangi textde hangi view kullanıcağını belirler
    override fun onBindViewHolder(holder:LandmarkHolder, position: Int) {
        holder.binding.textView.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            //intent.putExtra("landmark",landmarkList.get(position))
            mySingleton.choosenLandMark=landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    //kaçtane oluşturulacağını belirlemeye yarar
    override fun getItemCount(): Int {
        return landmarkList.size
    }
}
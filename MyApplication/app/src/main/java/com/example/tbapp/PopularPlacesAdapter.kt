package com.tbapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tbapp.R
import com.tbapp.model.PopularPlace

class PopularPlacesAdapter(
    private val places: List<PopularPlace>
) : RecyclerView.Adapter<PopularPlacesAdapter.PopularPlaceViewHolder>() {

    inner class PopularPlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val placeImage: ImageView = itemView.findViewById(R.id.placeImage)
        val placeTitle: TextView = itemView.findViewById(R.id.placeTitle)
        val placeLocation: TextView = itemView.findViewById(R.id.placeLocation)
        val placeRating: TextView = itemView.findViewById(R.id.placeRating)
        val placePrice: TextView = itemView.findViewById(R.id.placePrice)
        val favoriteIcon: ImageView = itemView.findViewById(R.id.favoriteIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularPlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_popular_place, parent, false)
        return PopularPlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularPlaceViewHolder, position: Int) {
        val place = places[position]
        holder.placeImage.setImageResource(place.imageResId)
        holder.placeTitle.text = place.title
        holder.placeLocation.text = place.location
        holder.placeRating.text = "★ ${place.rating}"
        holder.placePrice.text = place.pricePerPerson

        if (place.isFavorite) {
            holder.favoriteIcon.setImageResource(R.drawable.ic_favorite_filled)
        } else {
            holder.favoriteIcon.setImageResource(R.drawable.ic_favorite_outline)
        }
    }

    override fun getItemCount(): Int = places.size
}

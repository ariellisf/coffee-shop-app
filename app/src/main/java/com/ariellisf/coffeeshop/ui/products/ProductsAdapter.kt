package com.ariellisf.coffeeshop.ui.products

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ariellisf.coffeeshop.R

class ProductsAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item_product, parent, false)
        context = parent.context
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        holder.titleTextView.text = product.title
        holder.descriptionTextView.text = product.description
        holder.priceTextView.text = product.price

        val imageId: Int = context.resources.getIdentifier(product.imageUrl, "drawable", context.packageName)
        holder.imageView.setImageResource(imageId)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewDescription)
        val priceTextView: TextView = itemView.findViewById(R.id.textViewPrice)
        val imageView: ImageView = itemView.findViewById(R.id.imageViewCoffee)
    }
}

package com.ariellisf.coffeeshop.ui.products

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ariellisf.coffeeshop.R

class ProductsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_products, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val layoutManager = GridLayoutManager(activity, 1)
        recyclerView.layoutManager = layoutManager

        val products = ProductsData.getProductList()

        recyclerView.adapter = ProductsAdapter(products)

        return view
    }
}
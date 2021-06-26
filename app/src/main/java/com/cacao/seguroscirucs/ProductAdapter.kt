package com.cacao.seguroscirucs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.vivebamba.client.models.Product

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_product_item, parent, false)

        return ProductViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        try {
            print("stop")
            val product = productList.first()
            holder.bind(product)
        } catch (e: Exception) {
            println()
            println("Exception ${e}")
            holder.bind(Product(name = "Hi"))
        }

    }


    override fun getItemCount(): Int = productList.size
}

class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val text = view.findViewById<TextView>(R.id.title)
    //val image = view.findViewById<TextView>(R.id.image)

    fun bind(product: Product) {
        text.text = product.name
        //Picasso.get().load()
    }

}
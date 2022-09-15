package com.example.clothesproject.cartRecyclerView

/*import android.view.LayoutInflater
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class ItemsAdapter(private val newList: ArrayList<Clothes>,val setnewcount:(Int,Int)->Unit): RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {
    // Create new views (invoked by the layout manager)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.items, parent, false)
        return MyViewHolder(itemView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(Holder: MyViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val currentItem = newList[position]
        Holder.productImage.setImageResource(currentItem.productImage)
        Holder.name.setText(currentItem.name)
        Holder.price.setText("${currentItem.price}")
        Holder.mptext.setText("${currentItem.count}")
        Holder.plus.setOnClickListener({V->
            newList[position].count++
            setnewcount(position,newList[position].count)

            Holder.mptext.setText("${currentItem.count}")
        })
        Holder.minus.setOnClickListener({V->
            newList[position].count--
            setnewcount(position,newList[position].count)
            Holder.mptext.setText("${currentItem.count}")
        })

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = newList.size


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var productImage: ImageView = itemView.findViewById(R.id.iv_productImage)
        var name: TextView = itemView.findViewById(R.id.name)
        var price: TextView = itemView.findViewById(R.id.price)
        var minus:ImageView=itemView.findViewById(R.id.imageView)
        var plus :ImageView=itemView.findViewById(R.id.imageView2)
        var mptext:TextView=itemView.findViewById(R.id.textView)
    }
*/
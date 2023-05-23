package com.example.fibonacciapp
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView.ViewHolder
    import androidx.recyclerview.widget.RecyclerView.Adapter
    import java.text.FieldPosition

    class NamesRvAdapter(var namelist: List<String>): Adapter<NamesViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(parent, R.layout., false)
            return NamesViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return namelist.size

        }

        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
            var currentName = namelist.get(position)
            holder.rvNumbers.text = currentName
        }

//    fun findViewHolder(holder: NamesViewHolder, position: Int): Int {
//        var currentName = namelist.get(position)
//        holder.tvItem.text = currentName
//    }
//
//    fun itemCount():Int {
//        return namelist.size
//    }

    }

    class NamesViewHolder(itemView:View):ViewHolder(itemView){
        var rvNumbers= itemView.findViewById<TextView>(R.id.rvNumbers)
    }





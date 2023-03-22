package com.example.android.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private  val newslist : ArrayList<News>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.animal_ticket,parent,false)
            return MyViewHolder(itemView, mListener)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val curretnItem = newslist[position]
            holder.heading.text = curretnItem.heading
            holder.description.text = curretnItem.description
        }

        override fun getItemCount(): Int {
            return newslist.size
        }



        class MyViewHolder(itemView: View,listener: onItemClickListener): RecyclerView.ViewHolder(itemView){
                val heading : TextView = itemView.findViewById(R.id.title1)
                val description : TextView = itemView.findViewById(R.id.desciption)

            init{

               itemView.setOnClickListener {
                   listener.onItemClick(adapterPosition)
               }

            }


        }

}
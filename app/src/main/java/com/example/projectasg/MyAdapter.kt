package com.example.projectasg

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (var con:Context,var list:List<UsersItem>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    inner class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        var name=v.findViewById<TextView>(R.id.textName)
        var email=v.findViewById<TextView>(R.id.textEmail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(con).inflate(R.layout.user_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text=list[position].name
        holder.email.text=list[position].email
    }

}
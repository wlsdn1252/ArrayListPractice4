package com.example.arraylistpractice4.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.arraylistpractice4.R
import com.example.arraylistpractice4.datas.Data

class Adapter (val mContext : Context, val resId : Int, val mList: List<Data>): ArrayAdapter<Data>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tmpRow = convertView
        val listPosition = mList[position]


        if(tmpRow == null){
            tmpRow = inf.inflate(R.layout.student_item_list,null)
        }
        val row = tmpRow!!

        val listName = row.findViewById<TextView>(R.id.listName)
        val listAge = row.findViewById<TextView>(R.id.listAge)

        listName.text = listPosition.name
        listAge.text = listPosition.age.toString()


        return row
    }

}
package com.example.arraylistpractice4.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.arraylistpractice4.R
import com.example.arraylistpractice4.datas.Data

class Adapter (val mContext : Context, val resId : Int, mList: List<Data>): ArrayAdapter<Data>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tmpRow = convertView

        if(tmpRow == null){
            tmpRow = inf.inflate(R.layout.student_item_list,null)
        }
        val row = tmpRow!!

        return row
    }

}
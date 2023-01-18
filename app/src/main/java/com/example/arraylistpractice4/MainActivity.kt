package com.example.arraylistpractice4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.arraylistpractice4.adapters.Adapter
import com.example.arraylistpractice4.datas.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : Adapter
    val mData = ArrayList<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = Adapter(this,R.layout.student_item_list,mData)

        mData.add(Data("ㅇㅎ",27))
        mData.add(Data("ㅂㅈㄷ",27))
        mData.add(Data("ㅁㄴㅇ",27))
        mData.add(Data("ㅋㅌㅊ",27))
        mData.add(Data("ㄱ쇼",27))
        mData.add(Data("ㅇㄹㅎ",27))
        mData.add(Data("호ㅓ",27))
        mData.add(Data("ㅇ로ㅠㅅ",27))

        mainListView.adapter = mAdapter



    }
}
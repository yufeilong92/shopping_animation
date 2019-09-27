package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)





        initEvent()
        initListener()
        initViewModel()
    }

    private fun initEvent() {
        val data = mutableListOf<String>()
        for (item in 0..10) {
            data.add("$item")
        }
        val adapte=RlvAdapter(this,data)
        val m= GridLayoutManager(this,1)
        rlv.layoutManager=m
        rlv.adapter=adapte
        adapte.setRecyclerListener(object :RlvAdapter.RecyclerItemListener{
            override fun itemClickListener(btn: Button) {
                bezier_anim.startCartAnim(btn, car_iv, R.layout.l_move)
            }

        })
    }

    private fun initListener() {

        buy.setOnClickListener {
            bezier_anim.startCartAnim(buy, car_iv, R.layout.l_move)
        }
    }

    private fun initViewModel() {

    }

}

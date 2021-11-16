package com.example.jimmycv.data

import com.example.jimmycv.R
import com.example.jimmycv.model.Cvs

class Datasource {

    fun loadCvs(): List<Cvs>{
        return listOf<Cvs>(
            Cvs(R.drawable.intro),
            Cvs(R.drawable.second),
            Cvs(R.drawable.third),
            Cvs(R.drawable.fourth),
            Cvs(R.drawable.fifth),
            Cvs(R.drawable.sixth),
            Cvs(R.drawable.seventh),
            Cvs(R.drawable.eigth),
            Cvs(R.drawable.nineth),
            Cvs(R.drawable.tenth),
            Cvs(R.drawable.eleventh_one),
            Cvs(R.drawable.twelth),
            Cvs(R.drawable.thirteeth)
        )

    }
}
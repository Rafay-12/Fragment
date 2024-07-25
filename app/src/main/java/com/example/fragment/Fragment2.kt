package com.example.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
class Fragment2 : Fragment() {
    private lateinit var nextPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        initUi(view)
        setListener()
        return view
    }

    private fun initUi(view: View){
        nextPage = view.findViewById(R.id.nextPage1)
    }

    private fun setListener(){
        nextPage.setOnClickListener{
            val intent = Intent(context,SecondActvitiy::class.java)
            intent.putExtra("testName","Rafay")
            intent.putExtra("testValue", 2)
            startActivity(intent)
        }
    }

    companion object {

    }
}
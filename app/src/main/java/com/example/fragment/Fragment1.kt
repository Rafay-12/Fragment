package com.example.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {
    private lateinit var nextPage: Button
    private lateinit var name: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        initUi(view)
        setListener()
        return view
    }

    private fun initUi(view:  View){
        nextPage = view.findViewById(R.id.nextPage)
        name = view.findViewById(R.id.name_on_fragment1)
    }

    private fun setListener(){
        nextPage.setOnClickListener{
            val intent = Intent(context,SecondActvitiy::class.java)
            intent.putExtra("userName", name.text.toString())
            startActivity(intent)
        }
    }

    companion object {

    }
}
package com.example.fragmentintroduction

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.Date

class ContentFragment : Fragment(R.layout.fragment_content) {

    private final val mTag: String = "ContentFragment"

    init {
        Log.d(mTag, "Constructor")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(mTag, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(mTag, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(mTag, "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val updateBtn = view.findViewById<Button>(R.id.updateButton)
        val updateBox = view.findViewById<TextView>(R.id.dateTextView)

        updateBtn.setOnClickListener(View.OnClickListener {
            val date = Date().toString()
            updateBox.text = date
        })
        Log.d(mTag, "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(mTag, "onViewRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d(mTag, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(mTag, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(mTag, "onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(mTag, "onDetach")
    }
}
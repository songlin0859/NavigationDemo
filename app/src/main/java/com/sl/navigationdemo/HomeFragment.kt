package com.sl.navigationdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

/**
 * @author differ
 */
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.button).setOnClickListener {
            //findNavController()
            NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_fun1Fragment)
        }

        view.findViewById<TextView>(R.id.button2).setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_fun2Fragment)
        }

        view.findViewById<TextView>(R.id.textView3).text = arguments?.getString("data") ?: "no data"
    }
}
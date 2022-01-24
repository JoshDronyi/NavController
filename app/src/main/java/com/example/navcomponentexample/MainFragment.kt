package com.example.navcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponentexample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var mainBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        mainBinding = FragmentMainBinding.inflate(inflater, container, false)

        initViews()

        return mainBinding.root
    }

    private fun initViews() {
        with(mainBinding) {
            blueFrag.setOnClickListener {
                val action =
                    MainFragmentDirections.actionMainFragmentToBlueFrag(message = "Blue frag is hella dope")
                findNavController().navigate(action)
            }

            purpleFrag.setOnClickListener {
                val action =
                    MainFragmentDirections.actionMainFragmentToPurpleFrag(purpMessage = "Purple frag is better")
                findNavController().navigate(action)
            }
        }
    }
}
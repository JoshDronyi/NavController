package com.example.navcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navcomponentexample.databinding.FragmentBlueBinding

class BlueFrag : Fragment() {

    private lateinit var blueBinding: FragmentBlueBinding
    private val args by navArgs<BlueFragArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        blueBinding = FragmentBlueBinding.inflate(inflater, container, false)

        blueBinding.blueText.text = args.message

        return blueBinding.root
    }


}
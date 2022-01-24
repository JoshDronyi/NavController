package com.example.navcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.navcomponentexample.databinding.FragmentPurpleBinding

class PurpleFrag : Fragment() {

    private lateinit var redBinding: FragmentPurpleBinding
    val args by navArgs<PurpleFragArgs>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        redBinding = FragmentPurpleBinding.inflate(inflater, container, false)

        redBinding.purpText.text = args.purpMessage
        return redBinding.root
    }


}
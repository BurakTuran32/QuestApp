package com.example.quest.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.quest.R
import com.example.quest.base.BaseFragment
import com.example.quest.databinding.FragmentStartRaceBinding


class StartRaceFragment : BaseFragment<FragmentStartRaceBinding>(FragmentStartRaceBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startbutton.setOnClickListener {
            findNavController().navigate(StartRaceFragmentDirections.actionStartRaceFragmentToQuestFragment())
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Start"
    }




}
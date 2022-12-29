package com.rahim.rahim_homework

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahim.rahim_homework.databinding.ActivityMain2Binding
import com.rahim.rahim_homework.databinding.FragmentMusicNameBinding

class MusicName : Fragment() {
private lateinit var binding: FragmentMusicNameBinding

    private var list = arrayListOf<MusicModel>()
    val data = R.id.music_name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicNameBinding.inflate(layoutInflater)
        return binding.root

    }



}



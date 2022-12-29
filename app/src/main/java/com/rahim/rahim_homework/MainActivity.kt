package com.rahim.rahim_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahim.rahim_homework.databinding.ActivityMain2Binding
import com.rahim.rahim_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<MusicModel>()
    val data = R.id.music_name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        val adapter = MusicAdapter(list,this::onClick)
        binding.recycle.adapter = adapter

        supportFragmentManager.beginTransaction().add(R.id.music_image,MusicImage()).commit()



    }
    private fun onClick(position:Int){
        intent.putExtra("Name",data.toString())
        val intent = Intent(this, ActivityMain2Binding::class.java)
        startActivity(intent)

    }

    private fun loadData() {
        list.add(MusicModel("1","Scarborough Fair","Simon and Garfunkel"))
        list.add(MusicModel("2","Соперница","Канцлер Ги"))
        list.add(MusicModel("3","Womanizer","Britney Spears"))
        list.add(MusicModel("4","Ame To Kusari","Megurine Luka"))
        list.add(MusicModel("5","Crowbars","LXNER, takeluf"))
        list.add(MusicModel("6","Merry GO Round of Life","Joe Hisashi"))
        list.add(MusicModel("7","Empathy","Crystal Castles"))
        list.add(MusicModel("8","Mr. Saxobeat","Alexandra Stan"))
        list.add(MusicModel("9","Dive In!"," JELEEL!"))
        list.add(MusicModel("10","Gimme! Gimme! Gimme! ","ABBA"))
    }


}
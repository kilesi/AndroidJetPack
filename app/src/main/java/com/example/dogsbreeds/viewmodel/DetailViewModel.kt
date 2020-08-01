package com.example.dogsbreeds.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogsbreeds.model.DogBreed

class DetailViewModel : ViewModel() {
    val dogLiveData = MutableLiveData<DogBreed>()
    fun fetch() {
        val dog = DogBreed("13","Simba","Hunting","19","breedGroup","bredFor","temperament","")
        dogLiveData.value = dog
    }
}
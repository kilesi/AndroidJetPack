package com.example.dogsbreeds.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogsbreeds.model.DogBreed

class ListViewModel : ViewModel() {
    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadingError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 =  DogBreed("13","Simba","Hunting","19","breedGroup","bredFor","temperament","")
        val dog2 =  DogBreed("14","Kiya","Security","20","breedGroup","bredFor","temperament","")
        val dog3 = DogBreed("15","Bosko","Guarding","21","breedGroup","bredFor","temperament","")
        val dogsList = arrayListOf<DogBreed>(dog1, dog2, dog3)

        dogs.value = dogsList
        dogsLoadingError.value = false
        loading.value = false
    }
}
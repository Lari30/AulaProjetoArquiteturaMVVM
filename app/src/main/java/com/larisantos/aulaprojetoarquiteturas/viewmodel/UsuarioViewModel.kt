package com.larisantos.aulaprojetoarquiteturas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.larisantos.aulaprojetoarquiteturas.model.Usuario

import com.larisantos.aulaprojetoarquiteturas.model.api.UsuarioAPI

class UsuarioViewModel : ViewModel() { //Passivo

    private val usuarioAPI = UsuarioAPI()
    val usuariosLiveData = MutableLiveData<List<Usuario>>()

    fun recuperarUsuarios() {


        //1) Regra de Negócio
        val lista = usuarioAPI.recuperarUsuarios()
        usuariosLiveData.value = lista



    }
}
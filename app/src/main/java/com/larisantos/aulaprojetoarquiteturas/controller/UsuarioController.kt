package com.larisantos.aulaprojetoarquiteturas.controller

import com.larisantos.aulaprojetoarquiteturas.model.Usuario
import com.larisantos.aulaprojetoarquiteturas.model.api.UsuarioAPI
import com.larisantos.aulaprojetoarquiteturas.view.MainActivity

class UsuarioController(
    //Alta dependência  /Alto acoplamento
    private val mainActivity: MainActivity
) {

    private val usuarioAPI = UsuarioAPI()

    init {
        //recuperarUsuarios()
    }

    fun recuperarUsuarios(){

    //1) Regra de Negócio
    val lista = usuarioAPI.recuperarUsuarios()

    //2) Exibir os dados na interface
        mainActivity.exibirUsuarios(lista)



    }
}








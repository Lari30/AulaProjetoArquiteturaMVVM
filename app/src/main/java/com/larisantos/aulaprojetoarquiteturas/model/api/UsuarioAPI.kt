package com.larisantos.aulaprojetoarquiteturas.model.api

import com.larisantos.aulaprojetoarquiteturas.model.Usuario

class UsuarioAPI {


    fun recuperarUsuarios() : List<Usuario>{
        val listaUsuario = listOf(
            Usuario("Jamilton", 35),
            Usuario("Pedro", 20),
            Usuario("Maria", 56),
            Usuario("Ana", 18),

        )
        return listaUsuario
    }
}
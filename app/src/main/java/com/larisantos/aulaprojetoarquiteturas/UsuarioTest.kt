package com.larisantos.aulaprojetoarquiteturas

import com.larisantos.aulaprojetoarquiteturas.model.Usuario
import com.larisantos.aulaprojetoarquiteturas.presenter.IUsuario
import com.larisantos.aulaprojetoarquiteturas.presenter.UsuarioPresenter
import com.larisantos.aulaprojetoarquiteturas.viewmodel.UsuarioViewModel

class UsuarioTest {

    inner class SimularActivity : IUsuario{
        override fun exibirUsuarios(lista: List<Usuario>) {
            println(lista)
        }
    }

    fun testarRecuperarUsuarios(){

        //Facilitar os testes MVP
        val simularActivity = SimularActivity()
        val usuarioPresenter = UsuarioPresenter(simularActivity)
        usuarioPresenter.recuperarUsuarios()



        //Simular testes com MVVM
        val usuarioViewModel = UsuarioViewModel()
        usuarioViewModel.recuperarUsuarios()

        //Entrada


        //Processamento


        //Saída
    }
}
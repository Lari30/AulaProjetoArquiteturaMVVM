package com.larisantos.aulaprojetoarquiteturas.presenter

import com.larisantos.aulaprojetoarquiteturas.model.api.UsuarioAPI

class UsuarioPresenter( //Ativo
    //Baixa dependência  /Baixo acoplamento
    private val activity: IUsuario
)  {

    //Injeção de dependências
    private val usuarioAPI = UsuarioAPI()

    fun recuperarUsuarios() {


        //1) Regra de Negócio
        val lista = usuarioAPI.recuperarUsuarios()

        //2) Exibir os dados na interface
        activity.exibirUsuarios(lista)

    }
}









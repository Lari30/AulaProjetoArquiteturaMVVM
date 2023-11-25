package com.larisantos.aulaprojetoarquiteturas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.larisantos.aulaprojetoarquiteturas.R
import com.larisantos.aulaprojetoarquiteturas.controller.UsuarioController
import com.larisantos.aulaprojetoarquiteturas.databinding.ActivityFeedBinding
import com.larisantos.aulaprojetoarquiteturas.databinding.ActivityMainBinding
import com.larisantos.aulaprojetoarquiteturas.model.Usuario
import com.larisantos.aulaprojetoarquiteturas.presenter.IUsuario
import com.larisantos.aulaprojetoarquiteturas.presenter.UsuarioPresenter
import kotlin.math.log

class FeedActivity : AppCompatActivity(), IUsuario {

    private val binding by lazy {
        ActivityFeedBinding.inflate( layoutInflater)
    }

    private lateinit var usuarioPresenter: UsuarioPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        usuarioPresenter = UsuarioPresenter(this)

        }

    override fun onStart() {
        super.onStart()
        usuarioPresenter.recuperarUsuarios()
    }

    override fun exibirUsuarios(lista: List<Usuario>) {

        var textoUsuario = ""
        lista.forEach { usuario ->
            textoUsuario += "${usuario.nome} - ${usuario.idade} \n"
        }
        Log.i("exibir_presenter", "$textoUsuario")


    }

}

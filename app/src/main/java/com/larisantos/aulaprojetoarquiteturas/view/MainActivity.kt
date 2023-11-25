package com.larisantos.aulaprojetoarquiteturas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.larisantos.aulaprojetoarquiteturas.R
import com.larisantos.aulaprojetoarquiteturas.controller.UsuarioController
import com.larisantos.aulaprojetoarquiteturas.databinding.ActivityMainBinding
import com.larisantos.aulaprojetoarquiteturas.model.Usuario
import com.larisantos.aulaprojetoarquiteturas.presenter.IUsuario
import com.larisantos.aulaprojetoarquiteturas.presenter.UsuarioPresenter

class MainActivity : AppCompatActivity(), IUsuario {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    //private lateinit var usuarioController: UsuarioController
    private lateinit var usuarioPresenter: UsuarioPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /* usuarioController = UsuarioController(
            this
        )
        //usuarioController.recuperarUsuarios()  //Ativa
        binding.btnRecuperar.setOnClickListener {
            usuarioController.recuperarUsuarios()
        }*/

        usuarioPresenter = UsuarioPresenter(this)
        binding.btnRecuperar.setOnClickListener {
            usuarioPresenter.recuperarUsuarios()
        }

    }

        //Passiva
        override fun exibirUsuarios(lista: List<Usuario>) {

            var textoUsuarios = ""
            lista.forEach { usuario ->
                textoUsuarios += "${usuario.nome} - ${usuario.idade} \n"
            }

            binding.textResultado.text = textoUsuarios

        }


    }


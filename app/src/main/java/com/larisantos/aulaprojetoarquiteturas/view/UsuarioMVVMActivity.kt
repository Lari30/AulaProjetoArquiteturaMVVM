package com.larisantos.aulaprojetoarquiteturas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.larisantos.aulaprojetoarquiteturas.R
import com.larisantos.aulaprojetoarquiteturas.databinding.ActivityMainBinding
import com.larisantos.aulaprojetoarquiteturas.databinding.ActivityUsuarioMvvmactivityBinding
import com.larisantos.aulaprojetoarquiteturas.viewmodel.UsuarioViewModel

class UsuarioMVVMActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityUsuarioMvvmactivityBinding.inflate(layoutInflater)
    }

    private lateinit var usuarioViewModel: UsuarioViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioViewModel = ViewModelProvider(this)[UsuarioViewModel::class.java]
        usuarioViewModel.usuariosLiveData.observe(this) { usuarios ->

            var resultadoLista = ""
            usuarios.forEach { usuario ->
                resultadoLista += "+${usuario.nome}\n"
            }
            binding.textLista.text = resultadoLista


        }


        binding.btnCarregar.setOnClickListener {
            usuarioViewModel.recuperarUsuarios()
        }
    }
}

package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{

            val miDialogo = CuadroDeDialogo()
            miDialogo.show(supportFragmentManager,"Mi dialogo")
//            val TAG="Infor"
//            Log.d(TAG,"El nombre es: ${binding.nombre.text}")
//            Log.d(TAG,"La descripción es: ${binding.descripcion.text}")
//            Log.d(TAG,"El teléfono es: ${binding.telefono.text}")
//            Log.d(TAG,"La web es: ${binding.web.text}")
//            Log.d(TAG,"La hora de apertura es: ${binding.Apertura.selectedItem}")
//            Log.d(TAG,"La hora de cierre es: ${binding.Cierre.selectedItem}")
//
//
//            if (binding.Parque.isChecked){
//                Log.d(TAG,"Esta marcada la opción: ${binding.Parque.text}")
//            }
//
//            if (binding.Mascotas.isChecked){
//                Log.d(TAG,"Esta marcada la opción: ${binding.Mascotas.text}")
//            }
//
//            if (binding.Restaurante.isChecked){
//                Log.d(TAG,"Esta marcada la opción : ${binding.Restaurante.text}")
//            }
//
//            if (binding.Deportes.isChecked){
//                Log.d(TAG,"Esta marcada la opción: ${binding.Deportes.text}")
//              }
















        }

    }


}
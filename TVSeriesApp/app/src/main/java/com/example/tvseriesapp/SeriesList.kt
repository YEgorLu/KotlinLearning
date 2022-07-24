package com.example.tvseriesapp

import android.widget.Spinner
import android.widget.Switch

class SeriesList {
    fun getListTv (spinner: String): ArrayList<String> {
        val list: ArrayList<String> = arrayListOf<String>()
        when(spinner)
        {
            "Комедия" -> list.add("Друзья")
            "Фентези" -> list.add("Игра престолов")
            "Ужасы" -> list.add("Ходячие мертвецы")
            "Фантастика" -> list.add("Футурама")
            "Криминал" -> {
                list.add("Во все тяжкие")
                list.add("Менталист")
            }

        }
        return list
    }
}
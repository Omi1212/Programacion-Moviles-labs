package com.oosca.laboratorio05.data

import com.oosca.laboratorio05.data.model.MovieModel

val name = "Super Mario Brothers"
val category = "Animation"
val description = "Un fontanero llamado Mario viaja por un laberinto subterráneo con su hermano, Luigi, intentando salvar a una princesa capturada."
val qualification = "9.6"



val movies = mutableListOf(
    MovieModel(name, category, description, qualification)
)
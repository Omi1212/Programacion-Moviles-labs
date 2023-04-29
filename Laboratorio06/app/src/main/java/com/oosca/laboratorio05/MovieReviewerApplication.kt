package com.oosca.laboratorio05

import android.app.Application
import com.oosca.laboratorio05.data.movies
import com.oosca.laboratorio05.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}
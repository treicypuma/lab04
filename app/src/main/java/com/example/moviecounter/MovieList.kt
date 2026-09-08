package com.example.moviecounter

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

data class Movie(val title: String, val year: String)

@Composable
fun MovieList(movies: List<Movie>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(movies) { movie ->
            MovieCard(title = movie.title, year = movie.year)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMovieList() {
    MovieList(
        movies = listOf(
            Movie("Inception", "2010"),
            Movie("Interstellar", "2014"),
            Movie("Oppenheimer", "2023")
        )
    )
}
package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
// @Service annotation is used with classes that provide some business functionalities
// @Service annotation is used to mark the class as a service provider
public class MovieService {
  @Autowired
  // @Autowired annotation is used for automatic dependency injection
  // @Autowired annotation injects object dependency implicitly
  private MovieRepository movieRepository;

  public List<Movie> allMovies() {
    return movieRepository.findAll(); // This method is provided by the MongoRepository interface
  }

  public Optional<Movie> getSingleMovie(String imdbId) {
    return movieRepository.findMoviesByImdbId(imdbId); // This method is provided by the MongoRepository interface
  }
}

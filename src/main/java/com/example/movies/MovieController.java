package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // The @RestController annotation tells Spring that this code describes an endpoint that should be made available over the web
@RequestMapping("api/v1/movies") // The @RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods
public class MovieController {
  @Autowired
  private MovieService movieService;

  @GetMapping
  // ResponseEntity represents the whole HTTP response: status code, headers, and body
  public ResponseEntity<List<Movie>> allMovies() {
    return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
  }

  @GetMapping("/{imdbId}")
  // @PathVariable annotation is used to extract the value of a URI template variable as a method parameter
  public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId) {
    return new ResponseEntity<Optional<Movie>>(movieService.getSingleMovie(imdbId), HttpStatus.OK);
  }


}

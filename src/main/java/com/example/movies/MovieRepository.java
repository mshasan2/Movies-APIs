package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // @Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
// @Repository annotation is a specialization of the @Component annotation with similar use and functionality
// @Repository annotation is a marker for any class that fulfills the role or stereotype of a repository (also known as Data Access Object or DAO)
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  // findMoviesByImdbId is a custom method that is not provided by the MongoRepository interface
  // This method is used to find a movie by its imdbId
  // Getter method can be used to get the value of the imdbId field, this can be used
  // on any property.
  Optional<Movie> findMoviesByImdbId(String imdbId);



}


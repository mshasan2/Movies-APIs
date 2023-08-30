package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Document annotation is used to indicate that a class is a MongoDB document
// @Document is used to map a class to noSQL database (specifically mongoDB), it represents a MongoDB documents.
@Document(collection = "movies")
@Data // @Data annotation is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
@AllArgsConstructor //AllArgsConstructor is a Lombok annotation to create a constructor with all required fields
@NoArgsConstructor //NoArgsConstructor is a Lombok annotation to create a constructor with no parameters
public class Movie {
  @Id // @Id annotation is used to mark a field as the primary key of the document
  private ObjectId id;
  private String imdbId;
  private String title;
  private String releaseDate;
  private String trailerLink;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;
  @DocumentReference // @DocumentReference annotation is used to mark a field as a reference to another document in MongoDB
  private List<Review> reviewIds;
}

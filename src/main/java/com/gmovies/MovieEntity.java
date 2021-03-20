package com.gmovies;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String title;
    String director;
    int rating;

    public MovieEntity(String title, String director, int rating) {
        this.title = title;
        this.director = director;
        this.rating=rating;
    }

    public MovieEntity(String title, String director) {
        this.title = title;
        this.director = director;
    }
}

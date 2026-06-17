package example.spring.rest.data.jpa.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.repo.MovieRepository;

@Service
public class MovieService {
 @Autowired
 private MovieRepository movieRepo;
 
 public Collection<Movie> getAll(){
	 
	 Collection<Movie> movieCollection= movieRepo.findAll();
	 
	 
	 return movieCollection;
	 
 }
 
 public Movie getById(Integer movieId) {
	 
	 Optional<Movie>op=movieRepo.findById(movieId);
	 Movie foundMovie=
			 op.orElse(null);
	 return foundMovie;
	 //ifPresent() , isEmpty()
 }
 
 public void create(Movie newMovie) {
	 movieRepo.save(newMovie);
 }
 
 public void update(Movie updateMovie) {
	 movieRepo.save(updateMovie);
 }
 
 public void deleteById(Integer movieId) {
	 movieRepo.deleteById(movieId);
	 
 }
 
}























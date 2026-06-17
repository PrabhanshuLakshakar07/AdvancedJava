package example.spring.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import example.spring.rest.entity.Movie;

public class MovieCatalog {

	private static Map<Integer,Movie> listOfMovies;
	
	static {
		listOfMovies=new HashMap<>();
		Movie m1 =new Movie(101,"Stanger things","thriler",120);
		Movie m2 =new Movie(102,"Wednesday","thriler",360);
		Movie m3 =new Movie(103,"Life give you tangagure","Life Lession",520);
	listOfMovies.put(m1.getMovieId(), m1);
	listOfMovies.put(m2.getMovieId(), m2);
	listOfMovies.put(m3.getMovieId(), m3);
	}
	
	//Return All Movies
	public static Collection<Movie> getAll(){
		Collection<Movie>movieCollection=listOfMovies.values();
		return movieCollection;
	}
	
	
}

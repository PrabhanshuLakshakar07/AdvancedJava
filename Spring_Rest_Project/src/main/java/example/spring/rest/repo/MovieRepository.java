package example.spring.rest.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import example.spring.rest.MovieCatalog;
import example.spring.rest.entity.Movie;

@Repository
public class MovieRepository {
	public Collection<Movie> getAll(){
		Collection<Movie> movieCollection=
				MovieCatalog.getAll();
		return movieCollection;
	}

}

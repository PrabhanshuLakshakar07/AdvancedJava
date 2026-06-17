package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Movie;

//@Repository no need of this because JpaRepository is already a managed component
//Therefore MovieRepository also become a managed componet

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}

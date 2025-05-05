package it.uniroma3.siw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Movie;
import it.uniroma3.siw.repository.MovieRepository;

/*La classe MovieService deve gestire netodi relativi ai film e interagire con il MovieRepository per eseguire operazioni sul database. */
/*usiamo un altra classe per disaccoppiare opearazioni database con operazioni corrispondenti sul framework */

@Service
public class MovieService {
	
	@Autowired //Autowired permette di creare un oggetto MovieRepository senza passare per definizione ed invocazione del costruttore della classe in questione
	private MovieRepository movieRepository;
	
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id).get();
	}
	
	public Iterable<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	public void save(Movie movie) {
		movieRepository.save(movie);
	}
}

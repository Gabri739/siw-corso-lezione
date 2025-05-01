package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.model.Movie;
import it.uniroma3.siw.service.MovieService;
import jakarta.validation.Valid;

/*La classe MovieController gestisce le richieste HTTP e fa in modo che venngano messi i dati a disposizione per la visualizzazione per produrre una risposta */
@Controller
public class MovieController {
		
	@Autowired //Autowired permette di creare un oggetto MovieRepository senza passare per definizione ed invocazione del costruttore della classe in questione
	MovieService movieService;

	@GetMapping("/movie/{id}")
	public String getMovie(@PathVariable("id") Long id, Model model) {
		model.addAttribute("movie", this.movieService.getMovieById(id));
		return "movie.html";
	}
	@GetMapping("/movie")
	public String showMovies(Model model) {
		model.addAttribute("movies", this.movieService.getAllMovies());
		return "movies.html";
	}
	@GetMapping("/formNewMovie")
	public String formNewMovie(Model model) {
		model.addAttribute("movie", new Movie());
		return "formNewMovie.html";
	}
	@PostMapping("/movie")
	public String newMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()){
			model.addAttribute("messaggioErroreTitolo", "Campo obbligatorio");
			return "formNewMovie.html";
		}else {
			this.movieService.save(movie);
			model.addAttribute("movie", movie);
			return "redirect:/movie/"+movie.getId();
		}
	}
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
}
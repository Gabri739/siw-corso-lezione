package it.uniroma3.siw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.uniroma3.siw.service.ArtistService;

/*La classe MovieController gestisce le richieste HTTP e fa in modo che venngano messi i dati a disposizione per la visualizzazione per produrre una risposta */
@Controller
public class ArtistController {
		
	@Autowired //Autowired permette di creare un oggetto MovieRepository senza passare per definizione ed invocazione del costruttore della classe in questione
	ArtistService artistService;

	@GetMapping("/artist/{id}")
	public String getArtist(@PathVariable("id") Long id, Model model) {
		model.addAttribute("artist", this.artistService.getArtistById(id));
		return "artist.html";
	}
	@GetMapping("/artist")
	public String showArtists(Model model) {
		model.addAttribute("artists", this.artistService.getAllArtist());
		return "artists.html";
	}
}
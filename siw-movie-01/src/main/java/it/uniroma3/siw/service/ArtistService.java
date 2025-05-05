package it.uniroma3.siw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Artist;
import it.uniroma3.siw.model.Movie;
import it.uniroma3.siw.repository.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;
	
	public Artist getArtistById(Long id) {
		return artistRepository.findById(id).get();
	}
	
	public Iterable<Artist> getAllArtist(){
		return artistRepository.findAll();
	}
	public void save(Artist artist) {
		artistRepository.save(artist);
		System.out.println("Nuovo film inserito correttamente");
	}

}

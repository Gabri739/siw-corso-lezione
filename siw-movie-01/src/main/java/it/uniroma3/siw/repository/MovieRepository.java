package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;
import it.uniroma3.siw.model.Movie;

/*L'interface MocvieRepository mi consente di gestire ed interagire con il database senza scrivere comandi SQL dirrettamente
tramite l'estensione di CrudRepository mi permette di getire le operazioni base come: Creazione di un nuovo elemento, Recupero delle info,
aggiornamento dei dati e rimozione dei dati */

public interface MovieRepository extends CrudRepository<Movie, Long>{

}

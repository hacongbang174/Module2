package service;

import model.Film;
import repository.FilmRepository;

import java.io.IOException;
import java.util.List;

public class FilmService {
    private FilmRepository filmRepository;

    public FilmService() {
        filmRepository = new FilmRepository();
    }

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public List<Film> getAllFilms() throws IOException {
        return filmRepository.getAll();
    }
    public Film getFilmById(long id) throws IOException {
        return filmRepository.findById(id);
    }
    public long findDurationTimeById(long id) throws IOException {
        return filmRepository.findById(id).getDurationTime();
    }
    public String findFilmById(long id) throws IOException {
        return filmRepository.findById(id).getName();
    }
}

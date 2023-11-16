package com.example.IntArtVerbos.Repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.IntArtVerbos.entity.word;

public interface VerbosRepositorio extends CrudRepository<word,String> {
    public abstract ArrayList<word> findbyword(String word);
}

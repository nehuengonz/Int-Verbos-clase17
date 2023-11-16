package com.example.IntArtVerbos.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntArtVerbos.Repositorio.VerbosRepositorio;
import com.example.IntArtVerbos.entity.word;

@Service
public class service {
    @Autowired
    VerbosRepositorio verborepositorio;

    public ArrayList<word> obtenerpalabra()
    {
        return (ArrayList<word>) verborepositorio.findAll();
    }

    public word guardaPalabra(word palabra)
    {
        return verborepositorio.save(palabra);
    }
    
}

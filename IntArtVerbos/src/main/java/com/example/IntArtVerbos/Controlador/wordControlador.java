package com.example.IntArtVerbos.Controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IntArtVerbos.Service.service;
import com.example.IntArtVerbos.entity.word;

@RestController
@RequestMapping("/")
public class wordControlador {
    @Autowired
    service wordService;
    
    @GetMapping
    public ArrayList<word> obtenerpalabra()
    {
        return wordService.obtenerpalabra();
    }
    @PostMapping
    public word guardaPalabra(@RequestBody word palabra)
    {
        return this.wordService.guardaPalabra(palabra);
    }
    @GetMapping("/all")
    public ArrayList<word> obteneWords()
    {
        return this.wordService.obtenerpalabra();
    }
}

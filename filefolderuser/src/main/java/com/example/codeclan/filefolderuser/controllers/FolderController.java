package com.example.codeclan.filefolderuser.controllers;

import com.example.codeclan.filefolderuser.models.Folder;
import com.example.codeclan.filefolderuser.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping
    public ResponseEntity<List<Folder>> getAllRaids() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity getFolder (@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createRaid(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity(folder, HttpStatus.CREATED);

    }
}

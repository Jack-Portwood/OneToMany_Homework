package com.example.codeclan.filefolderuser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.folder = folder;
    }

    public File(){
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}



package com.example.codeclan.filefolderuser.components;

import com.example.codeclan.filefolderuser.models.File;
import com.example.codeclan.filefolderuser.models.Folder;
import com.example.codeclan.filefolderuser.models.User;
import com.example.codeclan.filefolderuser.repositories.FileRepository;
import com.example.codeclan.filefolderuser.repositories.FolderRepository;
import com.example.codeclan.filefolderuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User peter = new User("Peter Kelly");
        userRepository.save(peter);
        Folder folder1 = new Folder( "Work", peter);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Peter's Stuff", peter);
        folderRepository.save(folder2);
        File file1 = new File("Business stuff",".Doc", folder1);
        fileRepository.save(file1);
        File file2 = new File("Year End", ".Doc", folder1);
        fileRepository.save(file2);
        File file3 = new File("Holiday2k15", ".Jpeg",folder2);
        fileRepository.save(file3);
        File file4 = new File("Flavoured Crisps", ".Jpeg", folder2);
        fileRepository.save(file4);
    }

}

package com.example.codeclan.filefolderuser;

import com.example.codeclan.filefolderuser.repositories.FileRepository;
import com.example.codeclan.filefolderuser.repositories.FolderRepository;
import com.example.codeclan.filefolderuser.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilefolderuserApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}



}

package com.sapient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDirectory {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a path");
		String path = Read.scanner.nextLine();
		
		Path curDir = Paths.get(path);
		Files.list(curDir).forEach(System.out::println);
	}

}

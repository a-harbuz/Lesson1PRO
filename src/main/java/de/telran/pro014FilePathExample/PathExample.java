package de.telran.pro014FilePathExample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("prog.txt");

//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());
//        System.out.println(path.getRoot());

//        Path subpath = path.subpath(1, 2);
//        System.out.println(subpath);
    }
}

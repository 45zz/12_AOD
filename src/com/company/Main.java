package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Stream stream = new Stream();
        stream.readFile("input.txt");
        stream.show();
        stream.saveToFileBinary("output.txt");
        stream.delete("45545");
        stream.show();
        stream.clearData();
        stream.show();
        stream.readFileBinary("output.txt");
        stream.show();
    }
}

package com.isa.oca.preparation.section7.lecture2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithMultipleResources {

    static void readAndWrite(String source, String target) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(target))) {
            String line = reader.readLine();
            writer.write(line);
        }
    }
}

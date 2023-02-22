package core.basesyntax.service.impl;

import core.basesyntax.service.FileReaderService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CsvFileReaderServiceImpl implements FileReaderService {
    @Override
    public List<String> readFromFile(String fileName) {
        File file = new File(fileName);
        List<String> transactions;
        try {
            transactions = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException("Can't read from file " + file, e);
        }
        return transactions;
    }
}
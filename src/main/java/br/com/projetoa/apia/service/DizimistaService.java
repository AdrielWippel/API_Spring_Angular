package br.com.projetoa.apia.service;

import br.com.projetoa.apia.modelo.Dizimista;
import br.com.projetoa.apia.modelo.Endereco;
import br.com.projetoa.apia.repository.DizimistaRepository;
import br.com.projetoa.apia.repository.EnderecoRepository;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

@Service
public class DizimistaService {

    @Autowired
    private DizimistaRepository dizimistaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void importCSV(MultipartFile file) throws IOException, CsvException {
        try (Reader reader = new InputStreamReader(file.getInputStream())) {
            CSVReader csvReader = new CSVReaderBuilder(reader)
                .withSkipLines(1)
                .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                .build();
            List<String[]> rows = csvReader.readAll();

            for (String[] row : rows) {
                Dizimista dizimista = new Dizimista();
                if (row[0] != "") {
                                    dizimista.setNome(row[0]);
                dizimista.setNascimento(row[1]);
                dizimista.setCpf(row[2]);

                Endereco endereco = new Endereco(row[3], row[4], row[5]);
                enderecoRepository.save(endereco);
                dizimista.setEndereco(endereco);
                dizimista.setTelefone(row[6]);
                dizimista.setEmail(row[7]);

                dizimistaRepository.save(dizimista);
                }
            }
        }
    }
}

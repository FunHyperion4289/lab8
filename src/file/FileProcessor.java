package file;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import customers.Customer;
import logic.Customers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    private final String fileName = "customer";
    private final String fileExtension = ".json";
    private final String directory = "D:\\";
    private final String filePath = directory + fileName + fileExtension;


    public void writeFile(Customers customers) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(filePath), customers.getCustomers1());

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public List<Customer> readFile() {

        File file = new File(filePath);
        List<Customer> customers = new ArrayList<>();

        if (file.length() == 0) {

            return customers;
        }

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            customers = objectMapper.readValue(new File(filePath), new TypeReference<List<Customer>>() {
            });

        } catch (IOException err) {

            err.printStackTrace();
        }

        return customers;


    }

}
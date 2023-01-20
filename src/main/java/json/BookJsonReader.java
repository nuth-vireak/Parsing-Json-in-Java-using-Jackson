package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BookJsonReader {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        File bookJsonFile = new File("src/main/resources/book.json");
        Book book = objectMapper.readValue(bookJsonFile, new TypeReference<>() {});

        System.out.println(book);

        File booksJsonFile = new File("src/main/resources/books.json");
        List<Book> books = objectMapper.readValue(booksJsonFile, new TypeReference<>() {});

        System.out.println(books);
    }
}

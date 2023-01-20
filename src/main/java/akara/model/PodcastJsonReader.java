package akara.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PodcastJsonReader {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        File podcastsJsonFile = new File("src/main/resources/podcasts.json");

        List<Podcast> podcasts = objectMapper.readValue(podcastsJsonFile, new TypeReference<>() {});

        System.out.println(podcasts.toString());
    }
}

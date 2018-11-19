package pl.dk.deserplay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
class ContentController {

    private final Map<String, Content> content = Map.of(
                "1", new Series("1", "Daredevil"),
                "2", new Episode("2", 3)
        );

    @GetMapping(path = "/content")
    Collection<Content> getAllContent() {
        return content.values();
    }

    @GetMapping(path = "/content/{id}")
    Content getContent(@PathVariable String id) {
        return content.get(id);
    }
}

package pl.dk.deserplay;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Episode extends Content {

    public static final String CONTENT_TYPE = "episode";

    private int episodeNumber;

    Episode(String id, int episodeNumber) {
        super(id, CONTENT_TYPE);
        this.episodeNumber = episodeNumber;
    }
}

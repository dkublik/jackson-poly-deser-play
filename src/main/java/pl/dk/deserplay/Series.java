package pl.dk.deserplay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Series extends Content {

    public static final String CONTENT_TYPE = "series";

    private String seriesName;

    Series(String id, String seriesName) {
        super(id, CONTENT_TYPE);
        this.seriesName = seriesName;
    }
}

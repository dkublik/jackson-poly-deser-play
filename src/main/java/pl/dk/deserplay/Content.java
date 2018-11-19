package pl.dk.deserplay;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "contentType",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "series", value = Series.class),
        @JsonSubTypes.Type(name = "episode", value = Episode.class),
})
class Content {

    private String id;

    private String contentType;

}

package pl.dk.deserplay

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DeserPlaySpec extends Specification {

    RestTemplate restTemplate = new RestTemplate()

    @LocalServerPort
    int port

    def "should correctly deserialize list"() {
        when:
        List<Content> contentList = restTemplate.exchange("http://localhost:${port}/content",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Content>>(){}).body

        then:
        contentList.size() == 2
        contentList.any { it.class == Series.class }
        contentList.any { it.class == Episode.class }
    }

    def "should correctly deserialize by Id"() {
        when:
        Content content = restTemplate.getForObject("http://localhost:${port}/content/1", Content.class)

        then:
        content.class == Series.class
    }
}

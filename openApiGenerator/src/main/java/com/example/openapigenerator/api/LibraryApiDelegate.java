package com.example.openapigenerator.api;
import com.example.openapigenerator.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link LibraryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T19:12:42.135942400+09:00[Asia/Seoul]")
public interface LibraryApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /library/books : This is summary
     * This a description
     *
     * @return This means its ok (status code 200)
     * @see LibraryApi#getAllBookInLibrary
     */
    default ResponseEntity<List<Book>> getAllBookInLibrary() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"bookAuthor\" : \"bookAuthor\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

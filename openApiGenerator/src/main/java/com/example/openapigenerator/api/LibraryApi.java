/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapigenerator.api;


import com.example.openapigenerator.model.Book;
import io.swagger.annotations.*;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T19:12:42.135942400+09:00[Asia/Seoul]")
@Validated
@Api(value = "library", description = "the library API")
public interface LibraryApi {

    default LibraryApiDelegate getDelegate() {
        return new LibraryApiDelegate() {
        };
    }

    /**
     * GET /library/books : This is summary
     * This a description
     *
     * @return This means its ok (status code 200)
     */
    @ApiOperation(value = "This is summary", nickname = "getAllBookInLibrary", notes = "This a description", response = Book.class, responseContainer = "List", tags = {"Library",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "This means its ok", response = Book.class, responseContainer = "List")})
    @GetMapping(
            value = "/library/books",
            produces = {"application/json"}
    )
    default ResponseEntity<List<Book>> getAllBookInLibrary() {
        return getDelegate().getAllBookInLibrary();
    }

}

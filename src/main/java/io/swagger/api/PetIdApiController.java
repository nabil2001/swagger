package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-24T01:53:53.720Z")

@Controller
public class PetIdApiController implements PetIdApi {

    public ResponseEntity<Void> petIdGet(
@ApiParam(value = "ID of the pet",required=true ) @PathVariable("petId") String petId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

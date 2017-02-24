package io.swagger.api;

import io.swagger.model.Pet;

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
public class DefaultApiController implements DefaultApi {

    public ResponseEntity<List<Pet>> rootGet(@ApiParam(value = "number of pets to return", defaultValue = "11") @RequestParam(value = "limit", required = false, defaultValue="11") Integer limit



) {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rootPost(

@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rootPut(

@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

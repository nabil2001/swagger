package io.swagger.api;

import io.swagger.model.Pet;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-24T01:53:53.720Z")

@Api(value = "", description = "the  API")
public interface DefaultApi {

    @ApiOperation(value = "", notes = "", response = Pet.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List all pets", response = Pet.class) })
    @RequestMapping(value = "/",
        produces = { "application/json", "text/html" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> rootGet(@ApiParam(value = "number of pets to return", defaultValue = "11") @RequestParam(value = "limit", required = false, defaultValue="11") Integer limit



);


    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Make a new pet", response = Void.class) })
    @RequestMapping(value = "/",
        produces = { "application/json", "text/html" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rootPost(

@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet

);


    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updates the pet", response = Void.class) })
    @RequestMapping(value = "/",
        produces = { "application/json", "text/html" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> rootPut(

@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet

);

}

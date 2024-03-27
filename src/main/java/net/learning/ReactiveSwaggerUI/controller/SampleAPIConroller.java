package net.learning.ReactiveSwaggerUI.controller;

import jakarta.validation.Valid;
import net.learning.ReactiveSwaggerUI.controller.dto.SampleRequest;
import net.learning.ReactiveSwaggerUI.controller.dto.SuccessSampleResponse;
import net.learning.ReactiveSwaggerUI.swagger.SubmitDocumentContract;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/sample")
public class SampleAPIConroller {

    @SubmitDocumentContract
    @PostMapping("/project")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<SuccessSampleResponse> submitImportDocument(
            @RequestBody @Valid SampleRequest requestPayload,
            @RequestHeader("HeaderField1") String headerField1, @RequestHeader("HeaderField2") String headerField2) {

        return Mono.just(new SuccessSampleResponse());

    }
}
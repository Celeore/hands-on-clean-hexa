package com.happytown.application.rest;

import com.happytown.domain.use_cases.AttribuerCadeaux;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/attributionCadeaux")
@Api(description = "API permettant d'attribuer un cadeau aléatoire aux habitants de Happy Town arrivés depuis plus de 1 an")
public class AttributionCadeauxAdapter {

    private final AttribuerCadeaux attribuerCadeaux;

    public AttributionCadeauxAdapter(AttribuerCadeaux attribuerCadeaux) {
        this.attribuerCadeaux = attribuerCadeaux;
    }

    @PostMapping
    @ApiOperation("Permet d'attribuer un cadeau aléatoire aux habitants de Happy Town arrivés depuis plus de 1 an")
    public void attribuerCadeaux() throws IOException {
        String fileName = "src/main/resources/cadeaux.txt";
        LocalDate now = LocalDate.now();
        attribuerCadeaux.execute(fileName, now);
    }

}

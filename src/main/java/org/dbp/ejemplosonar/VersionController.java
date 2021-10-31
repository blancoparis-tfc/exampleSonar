package org.dbp.ejemplosonar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired VersionService versionService;

    @GetMapping("/")
    public String version(){
        return versionService.getVersion();
    }
}

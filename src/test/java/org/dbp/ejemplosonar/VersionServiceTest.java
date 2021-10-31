package org.dbp.ejemplosonar;



import static org.junit.jupiter.api.Assertions.assertEquals;

//"import static org.assertj.core.api.asserts

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
 class VersionServiceTest {

    @Autowired VersionService versionService;

    @Test
     void testVersion(){
        assertEquals("1.0.1",versionService.getVersion(),"Version");
    }
}

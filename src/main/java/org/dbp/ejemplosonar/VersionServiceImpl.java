package org.dbp.ejemplosonar;

import org.springframework.stereotype.Service;

@Service
public class VersionServiceImpl implements VersionService {

    public String getVersion(){
        return "1.0.1";
    }

    public static void main(String[] args) {
        System.out.println("hola");    
    }
}

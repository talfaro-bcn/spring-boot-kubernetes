package org.soyphea.k8s;

import lombok.extern.slf4j.Slf4j;
import org.soyphea.k8s.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
*/
@SpringBootApplication
@Slf4j
public class K8SApplication implements CommandLineRunner {

    @Autowired
    UserConfig userConfig;   
    /*
    public static void main(String[] args) {
        try {
            Cipher c1 = Cipher.getInstance("DES"); // Noncompliant: DES works with 56-bit keys allow attacks via exhaustive search
        }
        catch(NoSuchAlgorithmException|NoSuchPaddingException e) { }
        
        SpringApplication.run(K8SApplication.class, args);
    }
    */
    @Override
    public void run(String... args) throws Exception {
        log.info(" Fetched user from k8s ConfigMap <spring-boot-k8s> is :{}", userConfig);

    }
}

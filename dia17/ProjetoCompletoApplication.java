package dia17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("dia17.*")
@ComponentScan(basePackages = {"dia17.*"})
@EntityScan("dia17.*")
public class ProjetoCompletoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run
        (ProjetoCompletoApplication.class,args);
    }
}
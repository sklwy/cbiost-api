package br.com.edu.cbiost;

import br.com.edu.cbiost.model.AcervoBiologico;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CbiostApplicationTests {

    public void teste(Class<?> classe) {
        List<Field> fields = Arrays.asList(classe.getDeclaredFields());
        fields.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
        teste(AcervoBiologico.class);
    }

}

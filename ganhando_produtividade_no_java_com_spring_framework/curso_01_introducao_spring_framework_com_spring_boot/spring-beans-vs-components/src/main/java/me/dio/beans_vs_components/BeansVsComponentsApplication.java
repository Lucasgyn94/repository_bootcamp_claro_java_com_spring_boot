package me.dio.beans_vs_components;

import me.dio.beans_vs_components.beansVsComponents.ConversorJson;
import me.dio.beans_vs_components.beansVsComponents.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansVsComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansVsComponentsApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) throws Exception {
		return args -> {
			String json = "{\"cep\": \"74590-711\",\"logradouro\": \"Avenida contorno\",\"localidade\": \"Goiania\"}";
			ViaCepResponse response = conversorJson.converter(json);
			System.out.println("Dados do cep: " + response);
		};
	}
}

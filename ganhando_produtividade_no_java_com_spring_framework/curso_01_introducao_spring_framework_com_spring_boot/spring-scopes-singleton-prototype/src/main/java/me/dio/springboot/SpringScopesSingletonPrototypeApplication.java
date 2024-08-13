package me.dio.springboot;

import me.dio.springboot.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringScopesSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScopesSingletonPrototypeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistemaMensagem) throws Exception {
		return args -> {
			sistemaMensagem.enviarConfirmacaoCadastro();
			sistemaMensagem.enviarMensagemBoasVindas();
			sistemaMensagem.enviarConfirmacaoCadastro();
		};
	}

}

package br.com.daysesoares;

import org.springframework.stereotype.Component;

@org.springframework.boot.context.properties.ConfigurationProperties(prefix="daysesoares.configuration")
@Component
public class ConfigurationProperties {

	private String filaligada;

	public String getFilaligada() {
		return filaligada;
	}

	public void setFilaligada(String filaligada) {
		this.filaligada = filaligada;
	}
	
	
	
}

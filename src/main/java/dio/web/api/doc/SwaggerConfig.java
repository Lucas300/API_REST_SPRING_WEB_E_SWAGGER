package dio.web.api.doc;

public class SwaggerConfig {
	private contact contato() {
		return new Contact(
			"Seu nome",
			"http://www.seusite.com.br",
			"voce@seusite.com.br";
		);
	}
	private apiInfoBuilder  apiInfoBuilder= new ApiInfoBuilder();
	apiInfoBuilder.title("title - Rest API");
	apiInfoBuilder.description("API exemplo de uso de Springboot web Rest API");
	apiInfoBuilder.version("1.0");
	apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
	apiInfoBuilder.license("licença - Sua Empresa");
	apiInfoBuilder.license("http://www.seusite.com.br");
	apiInfoBuilder.contact(this.contato());
	
	return 	apiInfoBuilder;
	}

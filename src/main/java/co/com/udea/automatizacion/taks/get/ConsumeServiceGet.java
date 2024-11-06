package co.com.udea.automatizacion.taks.get;

import co.com.udea.automatizacion.interaction.GetRequest;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ConsumeServiceGet {

    //Encapsulamos el metodo GetRequest
    public Performable apiget(String baseUrl, String request, String typeContent) {
        return Task.where("{0} call the service at execute GET",   //Retorna una tarea
                GetRequest.params(baseUrl, request, typeContent)
        );
    }
}
package imc;

public enum ImcStrings {


    MENSAJE_INGRESO_PESO("Por favor ingrese su peso en Kilogramos \n Ejemplo : 75 "),
    MENSAJE_INGRESO_ESTATURA("Por favor ingrese su altura en Metros \n Ejemplo : 1.73 "),
    MENSAJE_SU_IMC_ES("\n Su IMC es : "),
    MENSAJE_DADOS_LOS_DATOS("Dados los datos previamente ");


    ImcStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }



    private String mensaje;


}

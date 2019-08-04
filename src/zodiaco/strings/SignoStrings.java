package zodiaco.strings;

public enum SignoStrings {


    MENSAJE_SOLICITUD_MES_NACIMIENTO("Por favor ingrese el numero de su mes de nacimiento , \n Ejemplo : Agosto '8'"),
    MENSAJE_SOLICITUD_DIA_NACIMIENTO("Por favor ingrese el dia de su nacimiento , \n Ejemplo : '22'"),
    SUS_DATOS_DE_NACIMIENTO("Dados sus datos de nacimiento su signo zodiacal es: "),
    CAPRICORNIO("Capricornio"),
    ACUARIO("Acuario"),
    LEO("Leo"),
    PISCIS("Piscis"),
    LIBRA("Libra"),
    TAURO("Tauro"),
    ARIES("Aries"),
    GEMINIS("Geminis"),
    CANCER("Cancer"),
    VIRGO("Virgo"),
    ESCORPIO("Escorpio"),
    SAGITARIO("Sagitario"),
    INVALIDO("Por favor ingrese un valor valido")



    ;


    SignoStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }



    private String mensaje;

}

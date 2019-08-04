package zodiaco;


import zodiaco.entero.SingoEntrada;

import static zodiaco.strings.SignoStrings.*;
import javax.swing.*;

public class SignoLogica  extends SingoEntrada {


    public SignoLogica(int dia, int mes) {
        super(dia, mes);
    }

    public String signoZodiacal() {
        String signo = null;


        switch (getMes()) {

            case 1:
                // Enero
                if (getDia()<21)
                  signo= CAPRICORNIO.getMensaje();
                else
                    signo= ACUARIO.getMensaje();
                break;

            case 2:
                // Febrero
                if (getDia()<21) {
                    signo = ACUARIO.getMensaje();
                }else {
                    signo = PISCIS.getMensaje();
                }
                break;

                case 3:
                // Marzo
                if (getDia()<21) {
                    signo = PISCIS.getMensaje();
                }
                else{
                    signo=ARIES.getMensaje();}
                break;




            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }



    /////////////



    public String signoZodiacal2() {
        String signo = null;


        switch (getMes()) {

            case 4:
                // Abril
                if (getDia()<21){
                    signo=ARIES.getMensaje();}
                else {
                    signo = TAURO.getMensaje();
                }
                break;

            case 5:
                // Mayo
                if (getDia()<22)
                {signo=TAURO.getMensaje();}
                else {
                    signo = GEMINIS.getMensaje();
                }break;


            case 6:
                // Junio
                if (getDia()<22)
                {   signo=GEMINIS.getMensaje();}
                else
                {signo=TAURO.getMensaje();}
                break;


            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }

    public String signoZodiacal3() {
        String signo = null;


        switch (getMes()) {


            case 7:
                // Julio
                if (getDia()<23){
                    signo=CANCER.getMensaje();}
                else{
                    signo=LEO.getMensaje();}
                break;


            case 8:
                // Agosto
                if (getDia()<23) {
                    signo = LEO.getMensaje();
                }
                else {

                    signo = VIRGO.getMensaje();
                }
                break;

            case 9:
                // Septiembre
                if (getDia()<24)
                {signo=VIRGO.getMensaje();}
                else{
                    signo=LIBRA.getMensaje();}
                break;

            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }

    public String signoZodiacal4() {
        String signo = null;


        switch (getMes()) {



            case 10:
                // Octubre
                if (getDia()<25){
                    signo=LIBRA.getMensaje();}
                else{
                    signo=ESCORPIO.getMensaje();}
                break;

            case 11:
                // Marzo
                if (getDia()<23){
                    signo=ESCORPIO.getMensaje();}
                else{
                    signo=SAGITARIO.getMensaje();}
                break;

            case 12:
                if (getDia() <22)
                {
                    signo = SAGITARIO.getMensaje();}

                else if (getDia() <= 31){
                    signo = CAPRICORNIO.getMensaje();}
                break;
            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }




}
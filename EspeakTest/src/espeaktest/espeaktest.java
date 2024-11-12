package espeaktest;
import java.io.IOException; 

public class espeaktest { 

  

    public static void main(String[] args) { 

        try { 

            // Texto que quieres convertir a voz 

            String texto = "Hola buenas tardes"; 

  

            // Comando para ejecutar eSpeak en español 

            String command = "espeak -v es-la \"" + texto + "\"";


            // Ejecutar el comando 

            Process proceso = Runtime.getRuntime().exec(command); 

            proceso.waitFor(); // Espera a que el proceso termine 

  

        } catch (IOException | InterruptedException e) { 

            e.printStackTrace(); 

        } 

    } 

} 
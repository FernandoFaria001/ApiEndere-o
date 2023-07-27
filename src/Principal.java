import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

      Scanner leitura = new Scanner(System.in);
      ConsultaCep consultaCep = new ConsultaCep();

      System.out.println("Digite o cep: ");
      var cep = leitura.nextLine();

      try {
          Logradouro novo = consultaCep.buscaEndereco(cep);
          System.out.println(novo);
          GeraArquivo gerador = new GeraArquivo();
          gerador.geraAquivoJson(novo);

      }catch (RuntimeException e){
          System.out.println(e.getMessage());
      }






    }
}
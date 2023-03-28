import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Interrogatorio{

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


//        1. "Telefonou para a vítima?"
//        2. "Esteve no local do crime?"
//        3. "Mora perto da vítima?"
//        4. "Devia para a vítima?"
//        5. "Já trabalhou com a vítima?"

        System.out.println("Perguntas:");
        System.out.println("1. Telefonou para a vítima?");
        String resposta = scanner.next();
        respostas.add(resposta);

        System.out.println("2. Esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.println("3. Mora perto da vítima?");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.println("4. Devia para a vítima?");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.println("5. Já trabalhou com a vítima?");
        resposta = scanner.next();
        respostas.add(resposta);

        int count = 0;

        Iterator<String> contador = respostas.iterator();

        while(contador.hasNext()) {
            var resp = contador.next(); //Aqui utilizamos o resp como uma variavel local visto que nao podiamos mais usar respotas ou resposta
            if(resp.contains("s") || resp.contains("S")) {
                count++;
            }
        }

        switch (count){

            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }

    }

}
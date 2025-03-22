import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*   
            numeros inteiros -> sem casas decimais

          
            byte => 8 bits => -128 a 127
            short => 16 bits => -32.768 a 32.767
            int => 32 bits => -2.147.483.648 a 2.147.483.647
            long => 64 bits => -9.223.372.836.854.775.808 a 9.223.372.836.854.775.807 
        
        
            Numeros decimais = 1.2, 9.0, 5.50...

        
            float => 32 bits => precisão simples => 39.23, 123.6
            double => 64 bits => precisão dupla => para numero com muitas casas após a virgula
        

            Textos e etc

 
            String => representa palavras e frases
            char => Representar um unico caractere => a, b, c... (se declara com aspas simples)

            boolean => true ou false
        */
 
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Emerson";
        boolean bool = true;

        //                         0  1  2  3  4  5  6  7  8  9
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        colecaoDeInteiros[5] = 20;
        int[] novaColecao = new int[10];
        String novasPalavras = new String();


        // if (str.isBlank()) {
        //     System.out.println("Verdadeiro");
        // } else if (str == "desconhecido"){
        //     System.out.println("deconhecido reconhecido");
        // } else {
        //     System.out.println("Falso");
        // }

//        System.out.println(colecaoDeInteiros.length);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Emerson");

        System.out.println(nomes);

    }

   
}

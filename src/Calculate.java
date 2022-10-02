public class Calculate {
        public static void main (String[] args){
                //Github : @FagosCorp
                //Linkedin : ryan-souza-209b2a217
                //Acessar os args para pegar os valores inputados e devolver a resposta.
                // (Funcoes) -> Adicao ( + ) | Subtracao ( - ) | Divisao  ( / ) | Multiplicacao ( * )
                //Guardando os valores inputados no console (args) em variaveis.
                //args[0] e a se trata da funcao geralmente - >
                //.equals se for igual a esse valor retorna true !== false
                String operacao = args[0];
                int x = Integer.parseInt(args[1]);
                int y = Integer.parseInt(args[2]);

                if(operacao.equals("adicao")){
                        adicao(x,y);
                }
                else if(operacao.equals("subtracao")){
                        subtracao(x,y);
                }
                else if(operacao.equals("divisao")){
                        divisao(x,y);
                }
                else if(operacao.equals("multiplicacao")){
                        multiplicacao(x,y);
                }else{
                        System.out.println("Verifique seus argumentos!");
                }
        }
        static void adicao(int  x, int y){
                System.out.println(x + y);
        }
        static void subtracao(int  x, int y){
                System.out.println(x - y);
        }
        static void divisao(int  x, int y){
                 System.out.println(x / y);
        }
        static void multiplicacao(int  x, int y){
                System.out.println(x * y);
        }

}

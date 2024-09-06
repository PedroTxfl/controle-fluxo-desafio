public class ParametrosInvalidosException extends Throwable {
    public static void main(String[] args) {



        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm < parametroDois){
                System.out.println("jera");
            }

            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            int contador = 1;
            for(contador = 1; contador <=contagem; contador++) {
                System.out.println(contador);
            }
        }
    }
}

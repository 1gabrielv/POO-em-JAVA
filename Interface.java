package contas;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Emails email = new Emails();
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("O que deseja fazer?");
            System.out.println("Digite 'S' para sair ou 'E' para entrar");
            String op = scanner.nextLine().toUpperCase();
            if(op.equals("S")){
                break;
            }
            else if(op.equals("E")){
                System.out.println("Já possui cadastro?");
                System.out.println("Digite 'S' para sim ou 'N' para não");
                String op2 = scanner.nextLine().toUpperCase();
                if(op2.equals("S")){
                    conta.entrar();
                    break;
                }
                else if(op2.equals("N")){
                    conta.criar();
                    continue;
                }
            }
            else {
                System.out.println("Opção inválida");
                continue;
            }
        }
    }
}

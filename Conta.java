package contas;

import java.util.Scanner;

public class Conta {
    Scanner scanner = new Scanner(System.in);
    Emails emails = new Emails();

    public void criar() {
        while (true) {
            System.out.println("Crie um email");
            String email = scanner.nextLine();

            if (!emails.Listaemails.contains(email)) {
                emails.Listaemails.add(email);
                System.out.println("Crie uma senha");
                String senha = scanner.nextLine();
                emails.Listasenhas.add(senha);
                System.out.println("Conta criada com sucesso!");
                break;
            } else {
                System.out.println("Este email ja está sendo usado");
                continue;
            }
        }
    }


    public void entrar() {
        while (true) {
            System.out.println("Digite seu email");
            String email = scanner.nextLine();
            if (!emails.Listaemails.contains(email)) {
                System.out.println("Email inexistente");
                continue;
            } else {
                for (int i = 0; i < emails.Listaemails.size(); i++) {
                    if (emails.Listaemails.get(i).equals(email)) {
                        emails.indexemail = i;
                        break;
                    }
                }
                while (true) {
                    System.out.println("Digite sua senha");
                    String senha = scanner.nextLine();

                    if (!emails.Listasenhas.contains(senha)) {
                        System.out.println("Senha incorreta");
                        continue;
                    } else {
                        for (int i = 0; i < emails.Listasenhas.size(); i++) {
                            if (emails.Listasenhas.get(i).equals(senha)) {
                                emails.indexsenha = i;
                                break;
                            }
                        }
                        if (emails.indexsenha == emails.indexemail) {
                            System.out.println("Seja bem vindo!");
                            break;}
                        else{
                            System.out.println("senha incorreta");
                            continue;
                    }
                }

                }
            }
            break;
        }


    }

            }


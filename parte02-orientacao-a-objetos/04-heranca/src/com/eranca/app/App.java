package com.eranca.app;

import java.util.Scanner;

import com.eranca.model.Pessoa;
import com.eranca.model.PessoaFisica;
import com.eranca.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        empresa.razaoSocial = "Alex SA";
        empresa.nomeFantasia = "Kids Graça Eventos";
        empresa.cnpj = "92.861.556/0001-90";
        empresa.email = "kidsgraça@contato.com";
        empresa.adress = "Campo da Esparança";
        empresa.site = "www.pudim.com.br";

        System.out.println("Usuario: ");
        usuario.name = sc.nextLine();
        System.out.println("CPF: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Email: ");
        usuario.email = sc.nextLine();
        System.out.println("Telefone: ");
        usuario.phone = sc.nextLine();
    
        PessoaFisica novaPessoa =  new PessoaFisica(usuario.name, usuario.cpf);
        System.out.println(novaPessoa.name+" "+novaPessoa.cpf );
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.name));
        sc.close();
    }
}

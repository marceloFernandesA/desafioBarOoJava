import util.Bill;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill ticket = new Bill();

        System.out.print("Sexo: ");
        ticket.gender = sc.next().charAt(0);
        while (ticket.gender !='F' && ticket.gender != 'M'){
            System.out.print("Valor invalido! Favor digitar F ou M: ");
            ticket.gender = sc.next().charAt(0);
        }

        System.out.print("Quantidade de cervejas: ");
        ticket.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        ticket.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        ticket.barbecue = sc.nextInt();

        System.out.println();
        System.out.println("Relatório: ");
        System.out.printf("Consumo = R$ %.2f%n",ticket.feeding());
        if (ticket.couver() == 4){
            System.out.printf("Couvert = %.2f%n",ticket.couver());
        }else {
            System.out.println("Isento de Couvert");
        }
        System.out.printf("Ingresso R$ %.2f%n",ticket.ticket());
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n", ticket.total());



    }
}
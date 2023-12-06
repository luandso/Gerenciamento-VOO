package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Voo> voos = new ArrayList<>();

    public void Menu() {

        voos.add(new VooEmirates("DD-4", "Congonhas", "Tokyo", "25-09-2023", "00h00", 123));
        voos.add(new VooDelta("20C70C", "Guarulhos", "Madrid", "20-12-2023", "07h00", 777));
        voos.add(new VooAzul("C30M", "São Paulo", "Manaus", "11-10-2023", "15h15", 321));

        Scanner teclado = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            System.out.println("********* Bem-Vindo ********");
            System.out.println("\nMenu:\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Horários de Voos");
            System.out.println("2 - Destinos de Voos");
            System.out.println("3 - Datas de Partidas");
            System.out.println("4 - Companhias Aéreas");
            System.out.print("\nOpção: ");

            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 0:
                    System.out.println("Obrigado(A), volte sempre!");
                    sair = false;
                    break;
                case 1:
                    listarHorariosVoos();
                    break;
                case 2:
                    listarDestinos();
                    break;
                case 3:
                    listarDatas();
                    break;
                case 4:
                    listarCompanhiasAereas();
                    break;
            }
        }
    }

    private void listarHorariosVoos() {
        System.out.println("Lista de Horários de Voos:");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Hora do voo: " + voo.getHoraPartida());
            System.out.println();
        }
    }
    private void listarCompanhiasAereas() {
        System.out.println("Lista de Companhias Aéreas: ");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println();
        }
    }

    private void listarDestinos() {
        System.out.println("Lista de Destinos: ");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Horário Voo: " + voo.getHoraPartida());
            System.out.println("Local partida: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println();
        }
    }

    private void listarDatas() {
        System.out.println("Data dos voos: ");
        for (Voo voo : voos) {
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Data: " + voo.getDataPartida());
            System.out.println("Horário: " + voo.getHoraPartida());
            System.out.println();
        }
    }

}
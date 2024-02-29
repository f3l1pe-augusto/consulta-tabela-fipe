package com.example.consultatabelafipe.main;

import java.util.Scanner;

public class Main {

  private final Scanner scanner = new Scanner(System.in);

  public void showMenu() {
    System.out.println("\nDigite o tipo de veículo: 1 - Carro, 2 - Moto, 3 - Caminhão");
    int vehicleType = scanner.nextInt();

    System.out.println("Você escolheu: " + vehicleType);
  }
}

package com.example.consultatabelafipe.main;

import com.example.consultatabelafipe.service.ApiUsage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  private final Scanner scanner = new Scanner(System.in);
  private final ApiUsage apiUsage = new ApiUsage();

  public void showMenu() {

    System.out.print("\nDigite o tipo de veículo (carros, motos, caminhoes): ");
    String vehicleType = scanner.nextLine().toLowerCase(Locale.ROOT);

    String URL = "https://parallelum.com.br/fipe/api/v1/";
    var json = apiUsage.getData(URL + vehicleType + "/marcas");

    System.out.println(json);

  }
}

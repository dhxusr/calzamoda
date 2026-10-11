package com.calzamoda;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // objeto LogicaSistema para informacion critica del sistema.
    // Calzado actual para vender
    // Stock del calzado
    // itbms
    LogicaSistema lgs = new LogicaSistema();

    // objeto usuario para registrar o modificar usuarios
    // (solo se puede un usuario a la vez)

    // objeto Administrador para realizar las operaciones
    // y colocar las credenciales por defecto del adminsitrador
    Administrador admin = new Administrador("admin", "1234");

    int opc;
    while (true) {
      Utilidades.limCon();
      Encabezado.presentacion();
      System.out.println("");
      Encabezado.menu();
      opc = Utilidades.intInput("Ingrese una opcion", false);

      if (opc == 1) {
        // Seccion de Administrador
        admin.interfaz(lgs);

      } else if (opc == 2) {
        // Seccion de Usuario
        // verifica si hay un usuario creado.
        // verifica si hay parametros globales disponibles
        //
        // se le pide al usuario ingresar sus credenciales para verificar si
        // coinciden con el usuario actual en memoria.
        // realiza una venta
        Utilidades.limCon();

        if (!admin.usuarioActivo().estado()) {
          System.out.println("debug: " + admin.usuarioActivo().estado());
          System.out.println("No hay ningun usuario registrado.");

        } else if (lgs.calzadoActual == null || lgs.stockUnitario == 0 || lgs.itbms == 0) {
          System.out.println("No se puede realizar esta operacion. Parametros globales no disponibles.");

        } else {
          Utilidades.inicioSesion("Usuario", admin.usuarioActivo().nombre(), admin.usuarioActivo().clave());
          admin.usuarioActivo().venta(lgs);
        }

      } else if (opc == 0) {
        System.out.println("Ha salido del programa.");
        return;
      } else {
        System.out.println("Opcion no valida.");
      }

      System.out.print("Presione Enter para continuar...");
      scn.nextLine();
    }
  }
}

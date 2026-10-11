package com.calzamoda;

import java.util.Scanner;

public class Encabezado {
  private Encabezado() {
  }

  /**
   * Presentacion en consola de la UTP.
   */
  public static void presentacion() {
    System.out.println("UNIVERSIDAD TECNOLOGICA DE PANAMA");
    System.out.println("CENTRO REGIONAL DE CHIRIQUI");
    System.out.println("DESARROLLO DE SOFTWARE II");
    System.out.println("SEMESTRE II");
    System.out.println("PROFESOR: JAIME PALACIOS");
    System.out.println("ESTUDIANTE: DONACIANO ROSAS 4-809-2479");
  }

  /**
   * Muetra en consola el menu principal del programa.
   */
  public static void menu() {
    System.out.println("==================================================");
    System.out.println("     SISTEMA DE GESTIÓN - CALZAMODA STEP");
    System.out.println("==================================================");

    System.out.println("[MENÚ PRINCIPAL]");
    System.out.println("1. Administracion");
    System.out.println("2. Usuario");
    System.out.println("3. Reportes");
    System.out.println("0. Salir\n");
    System.out.println("--------------------------------------------------");
  }

  /**
   * Muestra en consola el menu para la seccion de administrador.
   */
  public static void menuAdmin() {
    System.out.println("==================================================");
    System.out.println("     SISTEMA DE GESTIÓN - CALZAMODA STEP");
    System.out.println("==================================================");

    System.out.println("[Administrador]");
    System.out.println("1. Registrar / Modificar usuario");
    System.out.println("2. Configurar parametros globales");
    System.out.println("0. Salir\n");
    System.out.println("--------------------------------------------------");
  }

  /**
   * Muestra en consola el menu para la seccion de cambio de parametros globales.
   */
  public static void menuParametrosGlobales() {
    System.out.println("==================================================");
    System.out.println("     SISTEMA DE GESTIÓN - CALZAMODA STEP");
    System.out.println("==================================================");

    System.out.println("[Parametros Globales]");
    System.out.println("1. Calzado");
    System.out.println("2. Stock Unitario");
    System.out.println("3. itbms");
    System.out.println("0. Salir\n");
    System.out.println("--------------------------------------------------");
  }
}

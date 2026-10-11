package com.calzamoda;

import java.util.Scanner;

public class Administrador {
  private String nombreAdmin;
  private String codigoAcceso;
  private Usuario usuario;

  public Administrador(String nombre, String codigo) {
    this.nombreAdmin = nombre;
    this.codigoAcceso = codigo;
  }

  // consultores
  public String nombre() {
    return this.nombreAdmin;
  }

  public String codigo() {
    return this.codigoAcceso;
  }

  public Usuario usuarioActivo() {
    return this.usuario;
  }

  /**
   * Crea un objeto de tipo Usuario pidiendo valores al usuario.
   *
   * @return Objeto de tipo Usuario.
   */
  public void crearUsuario() {
    Scanner scn = new Scanner(System.in);
    this.usuario = new Usuario("", "", true, 0);

    System.out.print("Ingrese el nombre del usuario: ");
    this.usuario.cambiarNombre(scn.nextLine());

    System.out.print("Ingrese la contrasena del usuario: ");
    this.usuario.cambiarClave(scn.nextLine());

    int ventas = Utilidades.intInput("Ingrese las ventas del usuario", false);
    this.usuario.cambiarVentas(ventas);
  }

  /**
   * Crea un objeto de tipo Calzado pidiendo valores al usuario.
   *
   * @return Objeto de tipo Calzado
   */
  public Calzado crearCalzado() {
    Scanner scn = new Scanner(System.in);

    String modelo;
    double talla;
    double precio;

    System.out.print("Ingrese el modelo del calzado: ");
    modelo = scn.nextLine();
    talla = Utilidades.doubleInput("Ingrese la talla del calzado", false);
    precio = Utilidades.doubleInput("Ingrese el precio del calzado", false);

    return new Calzado(modelo, talla, precio);
  }

  /**
   * Muestra un menu al usuario para seleccionar y cambiar los valores
   * en los atributos del objeto lgs.
   *
   * @param lgs Objeto de tipo LogicaSistema el cual se le cambiaran los valores
   *            de sus atributos.
   * @return retorna el mismo Objeto de tipo LogicaSistema con los atributos
   *         actualizados.
   */
  public void paramGlobales(LogicaSistema lgs) {
    Scanner scn = new Scanner(System.in);

    int opc;
    while (true) {
      Utilidades.limCon();
      Encabezado.menuParametrosGlobales();
      opc = Utilidades.intInput("Ingrese una opcion", false);

      Utilidades.limCon();
      switch (opc) {
        case 1:
          lgs.calzadoActual = crearCalzado();
          break;
        case 2:
          lgs.stockUnitario = Utilidades.intInput("Ingrese el stock unitario", false);
          break;
        case 3:
          lgs.itbms = Utilidades.doubleInput("Ingrese el itbms", false);
          break;
        case 0:
          return;
        default:
          System.out.println("Opcion no valida.");
          System.out.print("Presione Enter para continuar...");
          scn.nextLine();
          break;
      }
    }
  }

  public void interfaz(LogicaSistema lgs) {
    Scanner scn = new Scanner(System.in);

    // Se le pide al usuario que inicie sesion con las credenciales del admin.
    Utilidades.inicioSesion("Admin", this.nombre(), this.codigo());

    int opc;
    // Menu de las acciones que puede realizar un admin.
    while (true) {
      Utilidades.limCon();
      Encabezado.menuAdmin();
      opc = Utilidades.intInput("Ingrese una opcion", false);

      if (opc == 1) {
        // crear o "editar" un usuario.
        Utilidades.limCon();
        crearUsuario();
        System.out.println("Usuario registrado con exito.");

      } else if (opc == 2) {
        // modificar parametros globales en el objeto LogicaSistema.
        paramGlobales(lgs);
        System.out.println("Parametros modificados con exito.");

      } else if (opc == 0) {
        break;

      } else {
        System.out.println("Opcion no valida.");
      }

      System.out.print("Presione Enter para continuar...");
      scn.nextLine();
    }
  }
}

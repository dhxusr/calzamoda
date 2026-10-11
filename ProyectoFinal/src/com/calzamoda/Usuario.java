package com.calzamoda;

public class Usuario {
  private String nombreUsuario;
  private String clave;
  private boolean estado;
  private int ventasRealizadas;

  public Usuario(String nombre, String clave, boolean estado, int ventas) {
    cambiarNombre(nombre);
    cambiarClave(clave);
    cambiarEstado(estado);
    cambiarVentas(ventas);
  }

  // asignadores
  public void cambiarNombre(String n) {
    this.nombreUsuario = n;
  }

  public void cambiarClave(String c) {
    this.clave = c;
  }

  public void cambiarEstado(boolean e) {
    this.estado = e;
  }

  public void cambiarVentas(int c) {
    if (c < 0) {
      throw new IllegalArgumentException("Las ventas no pueden ser menor que cero.");
    }

    this.ventasRealizadas = c;
  }

  // consultores
  public String nombre() {
    return this.nombreUsuario;
  }

  public String clave() {
    return this.clave;
  }

  public boolean estado() {
    return this.estado;
  }

  public int compras() {
    return this.ventasRealizadas;
  }

  /**
   * Imprime en consola la informacion de una venta.
   * usuario
   * stock restante
   * info del calzado vendido
   * total de la venta
   *
   * @param lgs objeto de tipo LogicaSistema para acceder a los parametros
   *            globales del sistema.
   */
  public void venta(LogicaSistema lgs) {
    double precioItbms = lgs.itbms * lgs.calzadoActual.precio() / 100;

    System.out.println("Se ha realizado una venta.");
    System.out.println("Cajero: " + nombre());
    System.out.println("Stcok restante: " + (lgs.stockUnitario - 1));
    System.out.println("------------------------------------------------");
    lgs.calzadoActual.info();
    System.out.printf("Itbms (%.2f%%): %.2f\n", lgs.itbms, precioItbms);
    System.out.println("------------------------------------------------");
    System.out.printf("Total: %.2f\n", precioItbms + lgs.calzadoActual.precio());

    lgs.stockUnitario--;
    this.ventasRealizadas++;
  }
}

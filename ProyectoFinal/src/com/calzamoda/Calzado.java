package com.calzamoda;

public class Calzado {
  private String modelo;
  private double talla;
  private double precio;

  public Calzado(String modelo, double talla, double precio) {
    cambiarModelo(modelo);
    cambiarPrecio(precio);
    cambiarTalla(talla);
  }

  // modificadores
  public void cambiarModelo(String modelo) {
    this.modelo = modelo;
  }

  public void cambiarTalla(double talla) {
    if (talla < 0) {
      throw new IllegalArgumentException("La talla no puede ser menor que cero.");
    }

    this.talla = talla;
  }

  public void cambiarPrecio(double precio) {
    if (precio <= 0) {
      throw new IllegalArgumentException("El precio no puede ser menor que cero.");
    }

    this.precio = precio;
  }

  // consultores
  public String modelo() {
    return this.modelo;
  }

  public double talla() {
    return this.talla;
  }

  public double precio() {
    return this.precio;
  }

  /**
   * Imprime la info del calzado en consola.
   */
  public void info() {
    System.out.println("Modelo: " + modelo());
    System.out.println("Talla: " + talla());
    System.out.println("Precio: " + precio());
  }
}

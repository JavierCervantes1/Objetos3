/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Javier Tareas
 */
public class Complejos {

    private int numeros;
    private int complejos;
    private int denominador_uno;
    private int denominador_dos;

    public Complejos(int numeros, int complejos, int denominador_uno, int denominador_dos) {
        this.numeros = numeros;
        this.complejos = complejos;
        this.denominador_uno = denominador_uno;
        this.denominador_dos = denominador_dos;
    }

    public int getNumeros() {
        return numeros;
    }

    public int getComplejos() {
        return complejos;
    }

    public int getDenominador_uno() {
        return denominador_uno;
    }

    public int getDenominador_dos() {
        return denominador_dos;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public void setComplejos(int complejos) {
        this.complejos = complejos;
    }

    public void setDenominador_uno(int denominador_uno) {
        this.denominador_uno = denominador_uno;
    }

    public void setDenominador_dos(int denominador_dos) {
        this.denominador_dos = denominador_dos;
    }

    public Complejos suma(Complejos f2) {
        int num, com;
        Complejos f;
        int num1, com1;
        num = this.numeros + f2.numeros;
        com = this.complejos + f2.complejos;
        this.denominador_uno = 1;
        num1 = this.denominador_uno;
        this.denominador_dos = 1;
        com1 = this.denominador_dos;
        f = new Complejos(num, com, num1, com1);
        return f;
    }
    public Complejos resta(Complejos f2) {
        int num, com;
        Complejos f;
        int num1, com1;
        num = this.numeros - f2.numeros;
        com = this.complejos - f2.complejos;
        this.denominador_uno = 1;
        num1 = this.denominador_uno;
        this.denominador_dos = 1;
        com1 = this.denominador_dos;
        f = new Complejos(num, com, num1, com1);
        return f;
    }
    public Complejos multiplicacion(Complejos f2) {
        int num, com;
        Complejos f;
        int num1, com1, p1, p2, p3, p4;
        p1 = this.numeros * f2.numeros;
        p2 = this.numeros * f2.complejos;
        p3 = this.complejos * f2.numeros;
        p4 = this.complejos * f2.complejos * (-1);
        num = p1 + p4;
        com = p2 + p3;
        
        this.denominador_uno = 1;
        num1 = this.denominador_uno;
        this.denominador_dos = 1;
        com1 = this.denominador_dos;
        f = new Complejos(num, com, num1, com1);
        return f;
    }
    public Complejos division(Complejos f2) {
        int num, com;
        Complejos f;
        int num1, com1, n1, n2, n3, n4, p1, p2;
        n1 = this.numeros * f2.numeros;
        n2 = this.numeros * -f2.complejos;
        n3 = this.complejos * f2.numeros;
        n4 = this.complejos * -f2.complejos * (-1);
        num = n1 + n4;
        com = n2 + n3;
        
        p1= f2.numeros * f2.numeros;
        p2 = f2.complejos * -f2.complejos * (-1);

        this.denominador_uno = p1 + p2;
        num1 = this.denominador_uno;
        this.denominador_dos = p1 + p2;
        com1 = this.denominador_dos;
        f = new Complejos(num, com, num1, com1);
        return f;
    }

}

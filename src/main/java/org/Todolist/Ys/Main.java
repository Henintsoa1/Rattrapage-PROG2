package org.Todolist.Ys;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Appartement appartement = new Appartement("Paul","Luxurious","Spacy",24000);
     Immeuble immeuble = new Immeuble(10, "Paris");
        System.out.println(appartement);
        System.out.println(immeuble);
        }
    }

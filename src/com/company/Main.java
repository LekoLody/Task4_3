package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.append("Govno, zalupa, penis, her");
        printer.append("OxxxyMORON LOSHOK", "ProOxxy");
        printer.append("Sosi, leji, ebis, droji", "Pro jizn", 4);
        printer.append("Sosi, leji, ebis, droji", "Pro dobro", 4);
        printer.append("Sosi, leji, ebis, droji", "Pro lyubov", 4);
        printer.getTotalCount();
        printer.print();
        printer.getPendingPagesCount();
        printer.clear();
        printer.append("Sosi, leji, ebis, droji", "Pro jizn", 4);
        printer.print();
        printer.getTotalCount();
        printer.getPendingPagesCount();
    }
}

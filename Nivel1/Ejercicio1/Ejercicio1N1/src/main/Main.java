package main;

import model.Month;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<Month> months = new ArrayList<>();

        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));
        months.add(new Month("Setiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));

        months.add(7, new Month("Agosto"));

        System.out.println("ArrayList: \nMeses del año, incluido Agosto en la posición correcta: ");
        for (Month month : months){
            System.out.println(month);
        }

        Set<Month> monthSet = new HashSet<>(months);

        monthSet.add(new Month("Enero"));

        System.out.println("\nHashSet: \nNo mantiene el orden de inserción \nNo duplica si se implementa equals() y hasCode():");
        for (Month month : monthSet) {
            System.out.println(month);
        }

        System.out.println("\nRecorrido con iterador");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

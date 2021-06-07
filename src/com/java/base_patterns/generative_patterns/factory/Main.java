package com.java.base_patterns.generative_patterns.factory;


import com.java.base_patterns.generative_patterns.factory.specialist.Specialist;
import com.java.base_patterns.generative_patterns.factory.specialist_factory.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        runner();


    }

    static SpecialistFactory aboutWorkBySpecialty(String specialty) {

        if (specialty.equalsIgnoreCase("кардиолог")) {
            return new CardiologistFactory();

        } else if (specialty.equalsIgnoreCase("стоматолог")) {
            return new DentistFactory();

        } else if (specialty.equalsIgnoreCase("невролог")) {
            return new NeurologistFactory();

        } else if (specialty.equalsIgnoreCase("офтальмолог")) {
            return new OphthalmologistFactory();

        } else if (specialty.equalsIgnoreCase("педиатр")) {
            return new PediatricianFactory();

        } else if (specialty.equalsIgnoreCase("фармацевт")) {
            return new PharmacistFactory();

        } else if (specialty.equalsIgnoreCase("травматолог")) {
            return new TraumatologistFactory();
        } else {
            throw new RuntimeException(specialty + " в медицине такой специальности нет");
        }
    }

    static void runner(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите название медицинской специальности о которой хотите узнать ");

        String str = scanner.nextLine();


        SpecialistFactory specialistFactory = aboutWorkBySpecialty(str);

        Specialist specialist = specialistFactory.createSpecialist();

        specialist.aboutWork();


    }
}

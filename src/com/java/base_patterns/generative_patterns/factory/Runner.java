package com.java.base_patterns.generative_patterns.factory;

import com.java.base_patterns.generative_patterns.factory.specialist_factory.*;

import java.util.Scanner;

public class Runner {

    Scanner scanner = new Scanner(System.in);
    private boolean interrupt;
    String result;

    public void start() {

        System.out.println("Напишите название медицинской специальности о которой хотите узнать ");

        while(!interrupt) {

            String str = scanner.nextLine();

            result = str.toLowerCase();

            switch (result) {

                case "кардиолог":
                    new CardiologistFactory();
                    break;


                case "стоматолог":
                    new DentistFactory();
                    break;

                case "невролог":
                    new NeurologistFactory();
                    break;

                case "офтальмолог":
                    new OphthalmologistFactory();
                    break;

                case "педиатр":
                    new PediatricianFactory();
                    break;

                case "фармацевт":
                    new PharmacistFactory();
                    break;

                case "травматолог":
                    new TraumatologistFactory();
                    break;

                case "выход":
                    exit();
                    break;

                default:
                    System.out.println("Вы ввели неизвестную специальность.");
                    break;
            }
        }
    }

    public  SpecialistFactory aboutWorkBySpecialty() {



        while(!interrupt) {

            String str = scanner.nextLine();

            result = str.toLowerCase();

            switch (result) {

                case "кардиолог":
                    return new CardiologistFactory();


                case "стоматолог":
                    return new DentistFactory();


                case "невролог":
                    return new NeurologistFactory();


                case "офтальмолог":
                    return new OphthalmologistFactory();


                case "педиатр":
                    return new PediatricianFactory();


                case "фармацевт":
                    return new PharmacistFactory();


                case "травматолог":
                    return new TraumatologistFactory();


                case "выход":
                    exit();


                default:
                    System.out.println("Вы ввели неизвестную специальность.");


            }
        }

        return null;
    }

    void exit() {

        interrupt = true;
    }

}

package com.company;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String ... parameters) throws IOException {


        String empleadosRecords = "src//com/company/File.txt";

        List <Persona> empleados = new ArrayList<Persona>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(empleadosRecords));
        String line;

        while (null != (line = reader.readLine()))
        {
            Persona persona = new Persona();
            String[] words = line.split(":");

            persona.setNombre(words[0]);

            if (!(words.length < 2)){persona.setCiudad(words[1]);}
            if (!(words.length < 3)){persona.setEdad(words[2]);}
            empleados.add(persona);
            System.out.println(persona.getNombre());
        }

        List<Persona> empleados25 = empleados.stream()
                .filter(personaInEmpleados -> personaInEmpleados.getEdad()<25)
                .filter(personaInEmpleados -> personaInEmpleados.getEdad()>0)
                .collect(Collectors.toList());
        empleados25.forEach(personaInEmpleados -> System.out.println(personaInEmpleados.toString()));
    }





}

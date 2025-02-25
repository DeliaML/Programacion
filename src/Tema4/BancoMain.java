package Tema4;


import java.util.Scanner;


    public class BancoMain {


        public static PersonaBanco searchPersona(int dni, PersonaBanco[] persona) {
            for (PersonaBanco person : persona) {
                if (person != null && person.getDni() == (dni)) {
                    return person;
                }
            }
            return null;
        }


        public static Cuenta searchCuenta(int dni, int cont, PersonaBanco[] persona) {
            PersonaBanco person = searchPersona(dni, persona);
            if (person != null) {
                for (Cuenta cuenta : person.getCuenta()) {
                    if (cuenta != null && cuenta.getAccount() == (cont)) {
                        return cuenta;
                    }
                }
            }
            return null;
        }


        public static void ingersarBono(PersonaBanco[] persona) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el numero de cuenta");
            int cont = in.nextInt();
            System.out.print("Introduce la cantidad de dinero");
            int money = in.nextInt();
            System.out.print("Introduce el dni de la persona");
            int dni = in.nextInt();
            Cuenta cuenta = searchCuenta(dni, cont, persona);
            if (cuenta != null) {
                cuenta.recibirAbono(money);
            } else {
                System.out.println("No se ha encontrado la cuenta");
            }
        }


        public static void hacerPago(PersonaBanco[] persona) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el numero de cuenta");
            int cont = in.nextInt();
            System.out.print("Introduce la cantidad de dinero");
            int money = in.nextInt();
            System.out.print("Introduce el dni de la persona");
            int dni = in.nextInt();
            Cuenta cuenta = searchCuenta(dni, cont, persona);
            if (cuenta != null) {
                cuenta.reciboPagar(money);
            } else {
                System.out.println("No se ha encontrado la cuenta");
            }
        }


        public static void hacerTransferencia(PersonaBanco[] persona) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el numero de cuenta origen");
            int cont = in.nextInt();
            System.out.print("Introduce el numero de cuenta destino");
            int contador = in.nextInt();
            System.out.print("Introduce la cantidad de dinero");
            int money = in.nextInt();
            System.out.print("Introduce el dni de la persona origen");
            int dni = in.nextInt();
            System.out.print("Introduce el dni de la persona destino");
            int nif = in.nextInt();
            Cuenta cuenta = searchCuenta(dni, cont, persona);
            Cuenta account = searchCuenta(nif, contador, persona);
            if (cuenta != null && account != null) {
                cuenta.transferenciaCuenta(account, money);
            } else {
                System.out.println("No se ha encontrado alguna cuenta");
            }
        }


        public static void ahowMorosos(PersonaBanco[] persona) {
            System.out.println("Lista de morosos");
            for (PersonaBanco person : persona) {
                if (person != null && person.isMorosa()) {
                    System.out.println(person);
                }
            }
        }


        public static PersonaBanco newPersona() {
            Scanner in = new Scanner(System.in);
            System.out.println("Introduce los numeros del dni de la persona");
            int dni = in.nextInt();
            return new PersonaBanco(dni);
        }


        public static void newCuenta(PersonaBanco[] persona) {
            Scanner in = new Scanner(System.in);
            System.out.println("Introduce el dni de la persona que va ha abrir una cuenta");
            int dni = in.nextInt();
            System.out.println("Introduce el numero de cuenta");
            int id = in.nextInt();
            System.out.println("Introduce el dinero de la cuenta");
            int saldo = in.nextInt();
            PersonaBanco person = searchPersona(dni, persona);
            if (person != null) {
                person.addCuenta(new Cuenta(id, saldo));
            } else {
                System.out.println("No se ha encontrado el dni");
            }
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int res = 0;
            System.out.println("Introduce cuantas personas van a tener cuentas de banco");
            PersonaBanco[] persona = new PersonaBanco[in.nextInt()];
            int cont = 0;
            while (res != 8) {
                while (res < 1 || res > 7) {
                    System.out.println("Introduce un numero del 1 al 7 para realizar las siguientes opciones");
                    System.out.println("1. Instanciar objetos de tipo Persona");
                    System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona");
                    System.out.println("3. Mostrar datos de una persona (por su dni).");
                    System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).");
                    System.out.println("5. Recibir un pago (por dni y núm de cuenta).");
                    System.out.println("6. Realizar transferencia entre cuentas");
                    System.out.println("7. Imprimir las personas morosas.");
                    System.out.println("8. Salir del programa");
                    res = in.nextInt();
                }
                switch (res) {
                    case 1:


                        persona[cont] = newPersona();
                        cont++;


                        break;


                    case 2:


                        newCuenta(persona);


                        break;


                    case 3:


                        System.out.println("Introduce el dni de la persona");
                        int dni = in.nextInt();
                        PersonaBanco person = searchPersona(dni, persona);
                        System.out.println(person);


                        break;


                    case 4:


                        ingersarBono(persona);


                        break;


                    case 5:


                        hacerPago(persona);


                        break;


                    case 6:


                        hacerTransferencia(persona);


                        break;


                    case 7:


                        ahowMorosos(persona);


                        break;
                }
                System.out.println("Introduce un numero del 1 al 7 para realizar las siguientes opciones");
                System.out.println("1. Instanciar objetos de tipo Persona");
                System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona");
                System.out.println("3. Mostrar datos de una persona (por su dni).");
                System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).");
                System.out.println("5. Recibir un pago (por dni y núm de cuenta).");
                System.out.println("6. Realizar transferencia entre cuentas");
                System.out.println("7. Imprimir las personas morosas.");
                System.out.println("8. Salir del programa");
                res = in.nextInt();
            }
        }
    }



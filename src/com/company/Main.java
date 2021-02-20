package com.company;

import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /*Información de usuario para entrar al sistema

       Nombre de Usuario: AlexG64
       Contraseña del usuario: Qwerty12345

         */

        Scanner entrada = new Scanner(System.in);
        String enter;

        //información determinada de cliente (se puede modificar en el sistema)
        String direccion = "panama";
        String Numerodetelefono = "7204040";
        String DNI = "4505050";
        String Nacionalidad = "39213912";
        //inventario
        String pantalon = "Pantalon de meszclilla azúl";
        String sudadera = "Sudadera Nike rosa";
        String Zapatillas = "Zapatillas air force 1 blancas";
        //Datos de usuario
        String usuario;
        String contraseña;
        String opcion;
        String contraseñaactual = "Qwerty12345";


        System.out.println("Inicio de sesión");
        System.out.println("Nombre de usuario: ");
        usuario = entrada.nextLine();
        System.out.println("Contraseña: ");
        contraseña = entrada.nextLine();


        if (usuario.equals("AlexG64") && contraseña.equals(contraseñaactual)) {
            do {
                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                //Datos de contraseña
                contraseña.equals(contraseña);
                //Datos del cliente
                direccion.equals(direccion);
                Numerodetelefono.equals(Numerodetelefono);
                DNI.equals(DNI);
                Nacionalidad.equals(Nacionalidad);
                //pedidos
                pantalon.equals(pantalon);
                sudadera.equals(sudadera);
                Zapatillas.equals(Zapatillas);

                System.out.println("Bienvenido");
                System.out.println("1: Cambiar contraseña");
                System.out.println("2: Llenar información de perfil");
                System.out.println("3: Pedir un artículo");
                System.out.println("4: Salir");
                System.out.println("\n");

                Scanner scan = new Scanner(System.in);
                System.out.println("Seleccione la opción que desea: ");
                opcion = scan.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                        System.out.println("Introducir contraseña actual: ");
                        contraseñaactual = entrada.nextLine();
                        if (contraseñaactual.equals(contraseña)) {
                            System.out.println("Introducir nueva contraseña: ");
                            contraseñaactual = entrada.nextLine();
                            System.out.println("Pulse enter para nueva sesión con nueva contraseña");
                            enter = entrada.nextLine();
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            System.out.println("Inicio de sesión ");
                            System.out.println("nombre de usuario: ");
                            usuario = entrada.nextLine();
                            System.out.println("contraseña: ");
                            contraseña = entrada.nextLine();
                            if (usuario.equals("AlexG64") && contraseña.equals(contraseñaactual)) {
                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                System.out.println("Notificación: La contraseña de su cuenta fue modificada");
                                System.out.println("Pulse enter para cerrar notificación y accesar al menú principal: ");
                                enter = entrada.nextLine();

                            } else {
                                System.out.println("Contraseña incorrecta. Por motivos de seguridad vuelva a iniciar el programa y accese con su contraseña anterior ");
                                enter = entrada.nextLine();
                                System.exit(0);
                            }
                        } else {
                            System.out.println("contraseña actual incorrecta presione enter para volver al menú: ");
                            enter = entrada.nextLine();
                        }
                        break;
                    case "2":

                        System.out.println(new String(new char[50]).replace("\0", "\r\n"));

                        System.out.println("Introduzca sus datos (sin símbolos)");
                        System.out.println("Dirección: ");
                        direccion = entrada.nextLine();
                        System.out.println("DNI: ");
                        DNI = entrada.nextLine();
                        System.out.println("Nacionalidad: ");
                        Nacionalidad = entrada.nextLine();
                        System.out.println("Número de telefono");
                        Numerodetelefono = entrada.nextLine();


                        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                        System.out.println("Datos de usuario");
                        System.out.println("Dirección: " + direccion);
                        System.out.println("Número de telefono: " + Numerodetelefono);
                        System.out.println("DNI: " + DNI);
                        System.out.println("Nacioladidad: " + Nacionalidad);

                        System.out.println("\n Datos guardados con éxito pulse enter para volver al menú: ");
                        enter = entrada.nextLine();
                        break;
                    case "3":

                        String opcion2;
                        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                        System.out.println("Seleccione cualquiera de los Articulos disponibles: ");
                        System.out.println("a: Pantalon de meszclilla azúl");
                        System.out.println("b: Sudadera Nike rosa ");
                        System.out.println("c: Zapatillas air force 1 blancas");
                        System.out.println("d: volver al menú");
                        System.out.println("\n");
                        System.out.println("Seleccione una opción: ");
                        opcion2 = entrada.nextLine();
                        switch (opcion2) {

                            case "a":
                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));

                                System.out.println("Usted ha elegido Pantalón de mezclilla azúl");
                                System.out.println("Vuelva al menú y escoja la opción 4 para terminar con su pedido");
                                System.out.println("Presione enter para volver al menú");
                                pantalon = entrada.nextLine();
                                pantalon = "pantalonmezclilla";
                                break;
                            case "b":
                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                System.out.println("Usted ha elegido Sudadera Nike rosa");
                                System.out.println("Vuelva al menú y escoja la opción 4 para terminar con su pedido");
                                System.out.println("Presione enter para volver al menú");
                                sudadera = entrada.nextLine();
                                sudadera = "Sudaderanike";
                                break;
                            case "c":
                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                System.out.println("Usted ha elegido Zapatillas air force 1 blancas");
                                System.out.println("Vuelva al menú y escoja la opción 4 para terminar con su pedido");
                                System.out.println("Presione enter para volver al menú");
                                Zapatillas = entrada.nextLine();
                                Zapatillas = "zapatillaairforce";
                                break;
                            case "d":
                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                System.out.println("Presione enter para volver al menú");
                                enter = entrada.nextLine();

                        }
                        break;
                    case "4":
                        if (pantalon.equals("pantalonmezclilla")) {
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            System.out.println("Su orden (Pantalones de mezclilla azúl) fue completada con éxito a la hora: " + new Date() + "\ny será enviada a: " + direccion);
                            System.out.println("Cualquier incoveniente con su pedido lo contactaremos a su telefono: " + Numerodetelefono);
                            System.out.println("");
                            System.out.println("Presione enter para salir del sistema");
                            enter = entrada.nextLine();
                            System.exit(0);
                        } else if (sudadera.equals("Sudaderanike")) {
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            System.out.println("Su orden (Sudadera Nike Rosa) fue completada con éxito a la hora: " + new Date() + "\ny será enviada a: " + direccion);
                            System.out.println("Cualquier incoveniente con su pedido lo contactaremos a su telefono: " + Numerodetelefono);
                            System.out.println("");
                            System.out.println("Presione enter para salir del sistema");
                            enter = entrada.nextLine();
                            System.exit(0);
                        } else if (Zapatillas.equals("zapatillaairforce")) {
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            System.out.println("Su orden (Zapatillas air force 1 blancas) fue completada con éxito a la hora: " + new Date() + "\ny será enviada a su domicilio en la dirección: " + direccion);
                            System.out.println("Cualquier incoveniente con su pedido lo contactaremos a su telefono: " + Numerodetelefono);
                            System.out.println("");
                            System.out.println("Presione enter para salir del sistema");
                            enter = entrada.nextLine();
                        } else {
                            System.out.println("Gracias por elegirnos");
                            System.out.println("Presione enter para salir del sistema");
                            enter = entrada.nextLine();
                            System.exit(0);
                        }
                        break;
                }
            } while (!opcion.equals("5"));
        } else {
            System.out.println("Usuario o contraseña incorrectas...");
        }

    }
}






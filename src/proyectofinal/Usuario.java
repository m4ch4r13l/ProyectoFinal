/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author tikis
 */
public class Usuario {
    
    public Usuario users[] = new Usuario[15];
    public int idUsers = 0;
    int registro;
    String nombre;
    String contrasena;
    boolean admin;
    boolean disponible;

    public Usuario(int registro, String nombre, String contrasena, boolean admin, boolean disponible) {
        this.registro = registro;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.admin = admin;
        this.disponible = disponible;
    }

    public Usuario() {
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void add(int registro, String nombre, String contrasena, boolean admin, boolean disponible){
        users[idUsers] = new Usuario(0,null,null,false,false);
        users[idUsers].setRegistro(registro);
        users[idUsers].setNombre(nombre);
        users[idUsers].setContrasena(contrasena);
        users[idUsers].setAdmin(admin);
        users[idUsers].setDisponible(disponible);
        idUsers++;
    }
    
    public void loadUsers(){
        add(idUsers+1,"Eduardo","123",true,true);
        add(idUsers+1,"Machariel","234",true,true);
        add(idUsers+1,"Jesus","456",false,true);
    }
    
    public void deleteUser(int registro) {
        System.out.println("ENTRO A LA FUNCOIN");
        for (int i = 0; i < users.length; i++) {
            System.out.println("idUser: " + i);
            if (users[i] != null && users[i].getRegistro() == registro) {
                System.out.println("ENTRO AL IF");
                users[i] = null;
                Usuario[] newUsers = new Usuario[users.length - 1];

                for (int j = 0, k = 0; j < users.length; j++) {
                    System.out.println("ENTRO AL FOR 2");
                    if (users[j] != null) {
                        newUsers[k++] = users[j];
                    }
                }

                users = newUsers; // asigna el nuevo arreglo al arreglo original
                idUsers--;
                break;
            }
        }
    }
    
}

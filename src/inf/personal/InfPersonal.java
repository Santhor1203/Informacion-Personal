package inf.personal;
public class InfPersonal {

    String nombre = "Santiago",
           apellido_paterno = "Ramirez",
           apellido_materno = "Garay";
    int No_cuent = 1914582;
    String semestre = "2o semestre";
    String materias = "Calculo diferencial e integral, Mar y Jue: 9:00-11:00, "
            + "Circitos electricos Lun y Mier: 9:00-11:00, "
            + "Ingles 5 Lun y Mier: 19:00-21:00, "
            + "Programación Mar y Jue: 12:30-15:00, "
            + "Teoria de algoritmos Lun y Mie: 11:30-13:00, "
            + "Teoria de sistemas Lun y Mie: 7:00-8:30" ;
          
    
            
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " + No_cuent);
        System.out.println("El semestre que cursa es: " + semestre);
        System.out.println("Las materias que toma y horario son: " + materias);
    }
    
    public static void main(String[] args) {
        InfPersonal informacion= new InfPersonal();
        informacion.Informacion();
                
    }
    
}

package proyectoBaseDeDatdos;

import javax.swing.JOptionPane;

public class Curso {
	public static void main (String [] args) {
		boolean repetidor=true;
		int matricula;
		int semestre;
		int i = 0;
		int buscar;
		String nombre;
		String carrera;
        String apellidos;
        int edad;
        String fecha_nacimiento;
        ManejoDeLista ml = new ManejoDeLista();
        int menu;
        
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Inscripcion\n2. Buscar alumno\n3. Ver datos de la lista\n4. Salir"));
            switch(menu)
            {
                case 1:
                    
                    matricula=Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de control"));
                    if(ml.verificarAlumno(matricula))
                    {
                    	try{    
                    		nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
                            apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del alumno");
                            semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre que cursa el alumno"));
                            carrera = JOptionPane.showInputDialog("Ingrese la carrera del alumno");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno: "));
                            fecha_nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del alumno");
                            
                            ml.inscribirAlumno(nombre,apellidos,edad, fecha_nacimiento, matricula, carrera, semestre);
                    	}catch(NumberFormatException nfe)
                    	{
                    		JOptionPane.showMessageDialog(null,"Solo se aceptan numeros en semestre");
                    	}
                    }
                    else
                    	{
                        	JOptionPane.showMessageDialog(null,"El alumno ya esta inscrito");
                    	}
                    	break;
                case 2:
                    matricula=Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de control"));
                    ml.BuscarAlumno(matricula);
                    break;
                case 3:
                    ml.MostrarLista();
                    break;
                case 4:
                    break;
            }
          }while(menu!=4); 
	}

}

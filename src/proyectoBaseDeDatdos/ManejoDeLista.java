package proyectoBaseDeDatdos;

import javax.swing.JOptionPane;

public class ManejoDeLista {
	Alumno[] alumno=new Alumno[30];
    int nuevo=0;
    
    public void inscribirAlumno(String nombre,String apellidos,int edad, String fecha_nacimiento, int matricula, String carrera, int semestre) {
    	if(nuevo<30)
        {
                alumno[nuevo]=new Alumno(nombre, apellidos,edad,fecha_nacimiento,matricula,carrera,semestre);
                nuevo++;
        }
    }
    
    public void BuscarAlumno(int matricula)
    {
        for(int i=0;i<alumno.length;i++)
           {
               if(alumno[i]!=null)
               {
            	   if(alumno[i].getMatricula() == matricula){
              JOptionPane.showMessageDialog(null,"Matricula: " + alumno[i].getMatricula() +" \nNombre: " + alumno[i].getNombre() + "\nApellidos : " + alumno[i].getApellidos() +
            		  "\nEdad: " + alumno[i].getEdad() + "\n Fecha de nacimiento: "+ alumno[i].getFecha_nacimiento()+ " \nSemestre: " + alumno[i].getSemestre()
            		  	+ "\nCarrera: "+ alumno[i].getCarrera());
            	   }
            	   else{
            		   JOptionPane.showMessageDialog(null,"El alumno no esa inscrito");
            		   break;
            	   }
              }  
          }
    }
    
    public boolean verificarAlumno(int matricula) {
		for(int i = 0; i < alumno.length; i++) {
			if(this.alumno[i] != null) {
				if(this.alumno[i].getMatricula() == matricula) {
					return false;
				}
			}
		}
		return true;
	}
    
    public void MostrarLista()
    {
    for(int i=0;i<alumno.length;i++)
     {
        if(alumno[i]!=null)
        {
        	JOptionPane.showMessageDialog(null,"Matricula: " + alumno[i].getMatricula() +" \nNombre: " + alumno[i].getNombre() + "\nApellidos : " + alumno[i].getApellidos() +
          		  "\nEdad: " + alumno[i].getEdad() + "\n Fecha de nacimiento: "+ alumno[i].getFecha_nacimiento()+ " \nSemestre: " + alumno[i].getSemestre()
          		  	+ "\nCarrera: "+ alumno[i].getCarrera());
        }
        else
        {
            //JOptionPane.showMessageDialog(null,"La lista esta vacia");
            //
            break;
        }
     }
    }

}

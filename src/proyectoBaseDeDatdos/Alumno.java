package proyectoBaseDeDatdos;

public class Alumno {
	
	private String nombre;
    private String apellidos;
    private int edad;
    private String fecha_nacimiento;
    private int matricula;
    private String carrera;
    private int semestre;
    
    public Alumno(String nombre,String apellidos,int edad, String fecha_nacimiento, int matricula, String carrera, int semestre) {
    	
		this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
		this.matricula = matricula;
		this.carrera = carrera;
		this.semestre = semestre;
        
	}
    
 // get y set de nombre
 	public String getNombre() {
 		return nombre;
 	}

 	public void setNombre(String nombre) {
 		if(nombre != null && nombre != " ") {
 			this.nombre = nombre;
 		}
 	}
         
     // get y set apellidos
     public String getApellidos(){
    	 
          return apellidos;
     }
         
     public void setApellidos(String apellidos){
          this.apellidos = apellidos;
     }
 	
 	//get y set matricula
 	public int getMatricula() {
 		return matricula;
 		
 	}
 	
 	public void setMatricula(int matricula) {
 		this.matricula = matricula;
 	}
 	
 	// get y set carrera
 	public String getCarrera() {
 		return carrera;
 	}
 	
 	public void setCarrera(String carrera) {
 		this.carrera = carrera;
 	}
 	
 	// get y set semestre
 	public int getSemestre() {
 		return semestre;
 	
 	}
 	
 	public void setSemestre(int semestre) {
 		this.semestre = semestre;
 	}
         
     //get y set edad
    public int getEdad(){
    	
         return edad;
    }
         
    public void setEdad(int edad){
         this.edad = edad;
    }
         
    //get y set fecha_nacimiento
    public String getFecha_nacimiento(){
         return fecha_nacimiento;
    }
         
    public void setFecha_nacimiento(String fecha_nacimiento){
         this.fecha_nacimiento = fecha_nacimiento;
    }
 	
    public boolean equals(String Mat)
    {
        return (Mat.equals(matricula));
    }
 	// metodo toString
 	public  String toString() {
 		return "\nNombre: " + nombre + "\nApellidos: " + apellidos +"\nMatricula: " + matricula + "\nCarrera: " + 
                             carrera + "\nSemestre: " + semestre + "\nEdad: " + edad + "\nFecha de nacimiento: " + fecha_nacimiento;
 	}

}

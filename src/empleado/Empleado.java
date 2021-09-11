package empleado;


public class Empleado {
    
    
    
    //Atributos =  variables = Datos
    private int id;
    private String nombre;
    private String cargo;
    private double horasSemanales;
    private int salario;
    
      //Metodo= accion  = funcion especial

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getCargo() {
                return cargo;
            }

            public void setCargo(String cargo) {
                this.cargo = cargo;
            }

            public double getHorasSemanales() {
                return horasSemanales;
            }

            public void setHorasSemanales(double horasSemanales) {
                
                if (horasSemanales < 0) {
                    System.out.println("Formato invalido");
                }
                else{
                    this.horasSemanales = horasSemanales;
                }
                
                this.horasSemanales = horasSemanales;
            }

            public int getSalario() {
                return salario;
            }

            public void setSalario(int salario) {
                this.salario = salario;
            }

    
    
    
    //constructor
    
        public Empleado() {
            
            
         }
    
     
    //metodos= acciones= funciones
        
        public  int calcularSalario (double horas, int valor)
        {
                   
                //hola
                return 0;
        }


}
package modelo.vo;

public class Requerimiento_1Vo {
    private String ciudadResidencia;
    private Double promedio;
  
    public Requerimiento_1Vo() {
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return ciudadResidencia + " " + Math.round(promedio);
    }

}
    

    
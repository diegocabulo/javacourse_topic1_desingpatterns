package hotdogstand;

public class HotDog {
    private Integer id;
    private Boolean salsas;
    private Boolean papitas;
    private Boolean pineappleTrozos;
    private Boolean tocineta;
    // Si se desea agregar mas adiciones se deben agregar aca las variables, adicionalmente en la clase HotDogBuilder

    public HotDog(Integer id, Boolean salsas, Boolean papitas, Boolean pineappleTrozos, Boolean tocineta) {
        this.id = id;
        this.salsas = salsas;
        this.papitas = papitas;
        this.pineappleTrozos = pineappleTrozos;
        this.tocineta = tocineta;
    }

    @Override
    public String toString(){
        return "Tu perrito con pan y salchicha con ID "+id+ " tiene adicionalmente \n" +
                "salsas: " + formatBoolean(salsas) + "\n" +
                "Papitas: " + formatBoolean(papitas) + "\n" +
                "Piña en Trozos: " + formatBoolean(pineappleTrozos) + "\n" +
                "Tocineta: " + formatBoolean(tocineta) + "\n";
    }

    private String formatBoolean(Boolean check){
        return check ? "Verdadero" : "Falso";
    }
}

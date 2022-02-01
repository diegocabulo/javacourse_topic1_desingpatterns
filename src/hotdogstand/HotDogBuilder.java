package hotdogstand;

public class HotDogBuilder {
    private Integer id;
    private Boolean salsas= false;
    private Boolean papitas = false;
    private Boolean pineappleTrozos = false;
    private Boolean tocineta = false;
    // Si se desea agregar mas adiciones se deben agregar aca y crear su metodo, adicionalmente en la clase HotDog

    public HotDogBuilder(Integer id) {
        this.id = id;
    }

    public HotDogBuilder setSalsas(Boolean salsas){
        this.salsas = salsas;
        return this;
    }
    public HotDogBuilder setPapitas(Boolean papitas){
        this.papitas = papitas;
        return this;
    }
    public HotDogBuilder setPineappleTrozos(Boolean pineappleTrozos){
        this.pineappleTrozos = pineappleTrozos;
        return this;
    }
    public HotDogBuilder setTocineta(Boolean tocineta){
        this.tocineta = tocineta;
        return this;
    }

    //Si se desean agregar mas ingredientes se deben agregar como argumentos en el constructor.
    public HotDog build(){
        return new HotDog(id,salsas,papitas,pineappleTrozos,tocineta);
    }

}

public class Par <T,U>{
    private T primeiro;
    private U segundo;

    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    public Par(T primeiro, U segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;

    }

}

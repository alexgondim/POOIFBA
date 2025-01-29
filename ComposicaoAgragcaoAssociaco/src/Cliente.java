public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;

    }

    public void comprar(Produto produto){
        System.out.println(this.nome + " comprado com sucesso!" + produto.getNome() + " por R$" + produto.getPreço());

    }


}

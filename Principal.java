public class Principal {
    
    public static void main(String[] args) {
        Filme f=new Filme();

        f.setCodigo(13);

        f.setValor(25);

        f.setNome("Harry Potter");
            
        f.setDisponivel(true);
        if (f.isDisponivel()){
            System.out.println(" "+f.getCodigo());
            System.out.println(" "+f.getValor());
            System.out.println(" "+f.getNome());
        }else{
            System.out.println("filme não disponivel");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto shampoo = new Produto("Shampoo", 50);


        System.out.println(shampoo.getNome());
        System.out.println(shampoo.getQuantidade());

        Categoria higiene = new Categoria("Higiene");
        System.out.println(higiene.getDescricao());
    }
}
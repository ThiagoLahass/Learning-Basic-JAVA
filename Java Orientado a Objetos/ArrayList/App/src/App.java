import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Usuario> usuarios = new ArrayList<>();

        for(int u = 0; u < 5; u++ ){
            Usuario usuario = new Usuario("Nome " + u, "Sobrenome " + u );
            usuarios.add(usuario);
        }

        for( Usuario u : usuarios ){
            System.out.println(u.getNome());
            System.out.println(u.getSobrenome());
        }
        System.out.println("");

        Usuario usuario5 = new Usuario("Nome " + 5, "Sobrenome " + 5 );
        usuarios.add(usuario5);

        for( Usuario u : usuarios ){
            System.out.println(u.getNome());
            System.out.println(u.getSobrenome());
        }
        System.out.println("");

        usuarios.remove(usuario5);

        for( Usuario u : usuarios ){
            System.out.println(u.getNome());
            System.out.println(u.getSobrenome());
        }
        System.out.println("");
    }
}

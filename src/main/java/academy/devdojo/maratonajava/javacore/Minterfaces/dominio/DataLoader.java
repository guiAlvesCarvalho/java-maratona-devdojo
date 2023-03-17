package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checagem de permissões");
    };

}

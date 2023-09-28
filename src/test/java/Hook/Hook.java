package Hook;

public class Hook {
    public static void notificaciones(){
        try{
            System.out.println("ingresó a la notificación");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

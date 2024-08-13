public class file_2 {
    public static void main(String[] args) {
        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println(OS);

        if(OS.indexOf("win") >=0){
            System.out.println("Windows");
        } else if (OS.indexOf("mac") >= 0) {
            System.out.println("Mac");
        } else if (OS.indexOf("nix") >=0 || OS.indexOf("nux") >=0 || OS.indexOf("aix") >=0) {
            System.out.println("Linux");
        }else {
            System.out.println("Unknown System");
        }
    }
}

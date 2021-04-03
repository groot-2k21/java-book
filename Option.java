public class Option{
    public static void main(String[] args){
        if (args.length > 0) {
            switch (args[0]) {
                case "-en":
                    System.out.println("Set English language");
                    break;
                    case "-es":
                    System.out.println("Set Spanish language");
                    break;
                default:
                    System.out.println("Unknown options");
                    break;
            }
        }
        else {
            System.out.println("Programm need options. Example: java <program> -en");
        }
    }
}
public class Bitwise{
    public static void main(String[] args){
        int fs = 53; // Двоичное представление 00110101

        System.out.println("Флаг 1: " +  (((fs&1) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 2: " +  (((fs&2) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 3: " +  (((fs&3) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 4: " +  (((fs&4) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 5: " +  (((fs&5) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 6: " +  (((fs&6) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 7: " +  (((fs&7) > 0) ? "ВКЛ" : "выкл") );
        System.out.println("Флаг 8: " +  (((fs&8) > 0) ? "ВКЛ" : "выкл") );
    }
}
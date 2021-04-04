public class teststack {
    public static void main( String[] args ){
        stack stack = new stack();
        stack.push("David");
        stack.push("William");
        
        int count = hitung.count();
        Object object = stack.peek();
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Teratas Pada Stack : "+object);
        System.out.println("===================================");
        object = stack.pop();
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count = hitung.count();
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        object = stack.peek();
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
}
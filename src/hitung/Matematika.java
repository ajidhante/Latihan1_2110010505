package hitung;

public class Matematika {
    //membuat variable
    private double bil1, bil2;
    
    // membuat constructor
    public Matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
        
    }
    //membuat setPenjumlahan
    public double setPenjumlahan (){
        return bil1 + bil2;
    }
    
    //membuat setPengurangan
    public double setPengurangan (){
        return bil1 - bil2;
    }
    
    //membuat setPengalian
    public double setPengalian (){
        return bil1 * bil2;
    }
    
    //membuat setPembagian
    public double setPembagian (){
        return bil1 / bil2;
    }
    
    
}

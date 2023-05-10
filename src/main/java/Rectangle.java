
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        
    }
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }
    
    public void setLength(double len){
        this.length = len;
    }
    public double getLength(){
        return this.length;
        
    }
    public void setWidth(double wid){
        this.width = wid;
        
    }
    public double getWidth(){
        return this.width;
        
    }
    public double computeArea(){
    return getLength() * getWidth();
    }
}

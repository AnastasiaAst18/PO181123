import java.util.Comparator;

class Plant{
    private String species;
    public Plant(String species){
        this.species = species;
    }
}
class Tree extends Plant implements Comparable<Tree>{
    private double height;
    public Tree(String species, double height){
        super(species);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public int compareTo(Tree o) {
        return Double.compare(this.height, o.height);
    }
    @Override
    public String toString(){
        return "Drzewo(wysokość: " + height + "m)";
    }
}

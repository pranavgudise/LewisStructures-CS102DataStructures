package Main;

public class Main {
    public static void main(String[] args) {
        LewisStructure structure = new LewisStructure();
        structure.Root('A');
        structure.Add('B', "East");
        structure.Add('C', "South");
        structure.Move("East");
        structure.Add('D', "East");
        structure.Print(); 
    }
}
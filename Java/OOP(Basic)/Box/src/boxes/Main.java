package boxes;

public class Main {
    public static void main(String[]args){
        int vol;

        CatBox catbox = new CatBox();

        System.out.println("boxes.Box for a cat:");
       // System.out.println("Weight: " + catbox.weight + " kg.");
        System.out.println("Width: " + catbox.width + " cm.");
        System.out.println("Height: " + catbox.height + " cm.");
        System.out.println("Depth: " + catbox.depth + " cm.");
        System.out.println("Color: " + catbox.colors);

        catbox.setDim(catbox.width, catbox.height, catbox.depth);
        vol = catbox.getVolume();
        System.out.println("Volume: " + vol);

        System.out.println("----------------------");

        HeavyBox box = new HeavyBox(15, 10, 20, 5);
        vol = box.getVolume();
        System.out.println("The Heavy Box volume: " + vol);
        System.out.println("The Heavy Box weight: " + box.weight);
    }
}

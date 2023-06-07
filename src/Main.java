import java.util.*;


public class Main {

    public static void main(String[] args){
        String line1 = "asd 123 12 11";
        String line2 = "asd 123 12 1100";
        String line3 = "asd 123";
        String line4 = "asd 12300";
        String line5 = "asd 1 1 0";
        String line6 = "asd";
        List<class1> lines = new ArrayList<>();
        lines.add(new class1(line1));
        lines.add(new class1(line2));
        lines.add(new class1(line3));
        lines.add(new class1(line4));
        lines.add(new class1(line5));
        lines.add(new class1(line6));
        Collections.sort(lines);
        for(class1 line : lines){
            System.out.println(line.getLine());
        }
    }

}
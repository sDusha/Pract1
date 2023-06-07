public class class1 implements Comparable<class1>{
    private String line;
    class1(String line){
        this.line = line;
    }

    public int getSum() {
        int sum = 0;
        for(int i = 0; i < line.length() ; i++){
            if( Character.isDigit(line.charAt(i)) ){
                sum = sum + Character.getNumericValue(line.charAt(i));
            }
        }
        return sum;
    }

    public String getLine() {
        return line;
    }

    public int compareTo(class1 line){
        return this.getSum() - line.getSum();
    }
}

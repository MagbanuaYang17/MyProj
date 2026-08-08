public class ArrayLoops {
    public static void main(String[] args) {
        
        String [] amplifiers = {"Sakura", "Jbl", "Broadway", "Sony", "Bose"};
        for (String amp : amplifiers) {
            System.out.println(amp);
      }
         int count =0;
        while (count<amplifiers.length){
        System.out.println(amplifiers[count]);
            count++;
      }
    }
}
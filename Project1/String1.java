public class String1{

    public static void main(String [] args){


        //String name = new String("Raja"); In Java String is a class it will create a object. stores in heap memory.
        
        String s1 = " Raja  Talla  ";
        //name.append(" Talla"); we dont have append method in string
        String t = s1.trim(); // to trim the empty space left and right side..
        System.out.println(t);

        /*  length and access
        System.out.println(t.length());
        System.out.println(t.charAt(1));
        System.out.println(t.substring(4)+ " " + t.substring(4).length());
        System.out.println(t.substring(6,10));
        

        //Searching

        System.out.println(t.indexOf("Talla")); // checking index of Talla
        System.out.println(t.indexOf('a')); // Checking index of 'a'
        System.out.println(t.lastIndexOf('a')); // to check last index of a 
        System.out.println(t.contains("all")); // contains of 'all' in string
        System.out.println(t.startsWith("aj")); // to check to starts with 'Raj'
        System.out.println(t.endsWith("!")); //  to checks with ends with 
        

        //Comparing

        System.out.println("Raj".equals("raj")); // to compare two strings. false
        System.out.println("Raj".equalsIgnoreCase("raj")); // to compare and ignore if u matches in lower or upper.
        System.out.println("Raj".compareTo("Talla")); 

        //Changing case and whitespace

        System.out.println(t.toUpperCase()); // upper case
        System.out.println(t.toLowerCase()); //lower case
        System.out.println("  ".isBlank()); // to check blank
        System.out.println("".isEmpty());
        System.out.println(" hi ".strip());

        

        //Replacing..
        System.out.println(t.replace("Raja","Nagendra")); 
        System.out.println(t.replaceAll("[aeiou]", "@"));
        

        // Splitting and joining
        String part1 = "a,b,,c";
        String[] part2 = "a,b,,c".split(",");
        System.out.println(part1);
        System.out.println(part2.length);
        

        //Building and formatting

        System.out.println("ab".repeat(3));
        System.out.println("a".concat("b"));
        System.out.println(String.valueOf(42) + 1);
        System.out.println(String.format("%s is %d year old", "Raj",26));

        
       //Regex and characters

       System.out.println("12345".matches("\\d+"));
       long count = "hello world".chars().filter(c -> c == 'l').count();
       System.out.println(count);
       char[] ch =  "abc".toCharArray();
       System.out.println(ch.length);
        */


    }
}

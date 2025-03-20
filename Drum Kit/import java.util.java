import java.util.LinkedList;

class Main{
    public static void main(String[] args){
        LinkedList<String> languages = new LinkedList<>();

        // add elements in LinkedList

        languages.add("java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        languages.add("Kotlin");
        System.out.println("LinkedList:" + languages);

        // remove elements from index 3
        String str = languages.remove(3);
        System.out.println("Removed Element:" + str);

        System.out.println("Updated LinkedList:" + languages);
    }
}
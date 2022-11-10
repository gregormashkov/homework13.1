public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author esenin = new Author("Sergey", "Esenin");
        Book onegin = new Book("Eugene Onegin", pushkin, 1839);
        Book shagane = new Book("Shagane", esenin, 1920);
        System.out.println(onegin.getYear());
        onegin.setYear(1837);
        System.out.println(onegin.getYear());
        System.out.println(pushkin);
        System.out.println(esenin);
        System.out.println(onegin);
        System.out.println(shagane);
        // конец ДЗ



    }
}

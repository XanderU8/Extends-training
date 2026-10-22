class Main{
    public static void main(String[] args) {




//
//        Book simpleBook = new Book("Song of the ice and fire", "George Martin", 100);
//        simpleBook.schowInfo();
////        simpleBook.setTitle_type("Song of the ice and fire");
////        simpleBook.setAuthor_type("George Martin");
////        simpleBook.setPages(100);
//
//
//
//        simpleBook.schowInfo();

//        GameCharacter human1 = new GameCharacter("Olmix", 10);
//        GameCharacter human2 = new GameCharacter("Xander", 10);
//        Warior warior1 = new Warior("Max", 5, 4,100);
//        Warior warior2 = new Warior("Shu", 5, 2, 120);
//
//        human1.showInfo();
//        human2.showInfo();
//        warior1.Attack();
//        warior2.Attack();

         Developer developer1 = new Developer("Maxim",  800, "Java & COBOL & PhP", "Good");
         Developer developer2 = new Developer("Mykita", 3469.2, "Java / C++ / Python / ","Brilliant");
         Designer designer1 = new Designer("Anna", 3000, "Desing mashine","Jeans");
         Designer designer2 = new Designer("Maxim",1500,"Design Aparat", "Pullover");


         developer1.showInfo2();
         developer2.showInfo2();
         designer1.showDesignInfo();
         designer2.showDesignInfo();


    }
}
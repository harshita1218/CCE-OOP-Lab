class Game{
    void type(){
        System.out.println("indoor & outdoor games");
    }
    void print(){
        System.out.println("Hello");
    }
}
class cricket extends Game{
    void type(){
        System.out.println("cricket is an outdoor game");
    }
    void print(){
        System.out.println("Hello1");
    }
}
class chess extends Game{
    void type(){
        System.out.println("chess is an indoor game");
    }
    void print(){
        System.out.println("Hello2");
    }
}
class imp{
    public static void main(String[] args){
        // Game game=new Game();
        // cricket crik=new cricket();
        // chess pawn=new chess();

        // Game ref;
        Game r=new cricket();
        // cricket r = new Game();
        r.type(); 
        // ref=game;
        // ref.type();

        // ref=crik;
        // ref.type();
        // ref.print();

        // ref=pawn;
        // ref.type();
        // ref.print();
    }
}


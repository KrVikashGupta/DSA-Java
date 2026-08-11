public class Interface {
    public static void main(String args[]) { // ismi object bana saktae hai  ki kya kya hota hai queen j=kai ander moves 
        Queen q = new Queen();
        q.moves();


    }
}

interface ChessPlayer { // interface bananya ki chessPlayer kesa dikta hoga uska naam dia interface uskae ander hamesa moves hona chaiyae to queen kae lia rook kai lia move banaya dia 
    void moves(); // abstraction use kesa hua ? yaha par moves ka blueprint dia hai ki move kesae hona chaiya define nahi ki a kyki sabki alag alg moves hogi
}
class Queen implements ChessPlayer {  // 
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4  direction) ");
    }
}

class Rook implements ChessPlayer { // Rook means hathi
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class Kings implements ChessPlayer { // Rook means hathi
    public void moves() {
        System.out.println("up, down, left, right. diagonal by one step ");
    }
}



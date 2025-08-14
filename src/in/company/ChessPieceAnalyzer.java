package in.company;



import java.util.*;
import java.util.stream.Collectors;

// ChessPiece class
class ChessPiece {
    private String name;
    private String color; // "White" or "Black"
    private int xCoordinate;
    private int yCoordinate;

    public ChessPiece(String name, String color, int x, int y) {
        this.name = name;
        this.color = color;
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public String toString() {
        return color + " " + name + " at (" + xCoordinate + ", " + yCoordinate + ")";
    }
}

// ChessStream class
class ChessStream {

    public static long getBlackKnightCount(List<ChessPiece> pieces) {
        return pieces.stream()
                .filter(p -> p.getColor().equalsIgnoreCase("Black"))
                .filter(p -> p.getName().equalsIgnoreCase("Knight"))
                .count();
    }

    public static List<ChessPiece> getWhitePiecesInFirstRow(List<ChessPiece> pieces) {
        return pieces.stream()
                .filter(p -> p.getColor().equalsIgnoreCase("White"))
                .filter(p -> p.getYCoordinate() == 1)
                .collect(Collectors.toList());
    }

    public static int getSumOfBlackXCoordinates(List<ChessPiece> pieces) {
        return pieces.stream()
                .filter(p -> p.getColor().equalsIgnoreCase("Black"))
                .mapToInt(ChessPiece::getXCoordinate)
                .sum();
    }
}

// Main class
public class ChessPieceAnalyzer {
    public static void main(String[] args) {
        List<ChessPiece> pieces = new ArrayList<>();
        pieces.add(new ChessPiece("Knight", "Black", 2, 8));
        pieces.add(new ChessPiece("Bishop", "White", 3, 1));
        pieces.add(new ChessPiece("Queen", "Black", 4, 7));
        pieces.add(new ChessPiece("Rook", "White", 1, 1));
        pieces.add(new ChessPiece("Pawn", "Black", 5, 6));
        pieces.add(new ChessPiece("Knight", "Black", 6, 8));

        // Call and print results
        long blackKnightCount = ChessStream.getBlackKnightCount(pieces);
        System.out.println(" Black Knight Count: " + blackKnightCount);

        List<ChessPiece> whiteFirstRow = ChessStream.getWhitePiecesInFirstRow(pieces);
        System.out.println("\n White Pieces in Row 1:");
        whiteFirstRow.forEach(System.out::println);

        int blackXSum = ChessStream.getSumOfBlackXCoordinates(pieces);
        System.out.println("\n Sum of X Coordinates of Black Pieces: " + blackXSum);
    }
}



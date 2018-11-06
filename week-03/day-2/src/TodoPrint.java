public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todoStart = " My todo: \n";
        String todoGames = " - Download games\n";
        String todoDiablo = "\t - Diablo ";
        System.out.println(todoStart + todoText + todoGames + todoDiablo);
    }
}

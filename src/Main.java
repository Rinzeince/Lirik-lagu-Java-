public class Main {
    public static void main(String[] args) {
        String[] lyrics = {
                "Waking up alone I feel like part of me is missing",
                "Flipping through the photos of the memories we shared",
                "And I swear that I remember all the days we spent together",
                "But I ruin all the things that I hold close to me",
                "Now I'm regretting every thing we never did I can't face it",
                "The thought of you alone breaks my heart and I hate it",
                "But I hope that the sound of my voice is enough",
                "To reach the one that I'll always love"
        };

        int[] delay = {
                4000, // Lirik pertama 1 detik
                4000, // 2
                5000, // 3
                4000, // 4
                4800, // 5
                4500, // 6
                4300, // 7
                4700 // Lirik terakhir 1,5 detik
        };

        for (int i = 0; i < lyrics.length; i++) {
            System.out.println(lyrics[i]);
            try {
                // Menunggu sesuai delay
                Thread.sleep(delay[i]);
            } catch (InterruptedException e) {
                System.err.println("Thread interruped: " + e.getMessage());
            }
        }
    }
}
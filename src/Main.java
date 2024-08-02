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
                2000, // Lirik pertama 1 detik
                2000, // 2
                1800, // 3
                2500, // 4
                3000, // 5
                2000, // 6
                2500, // 7
                3000 // Lirik terakhir 1,5 detik
        };

        int charDelay = 40; // Delay per huruf dalam milidetik

        for (int i = 0; i < lyrics.length; i++) {
            String lyric = lyrics[i];
            for (int j = 0; j < lyric.length(); j++) {
                System.out.print(lyric.charAt(j));
                try {
                    Thread.sleep(charDelay);
                } catch (InterruptedException e) {
                    System.err.println("Thread interruped: " + e.getMessage());
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah lirik selesai ditampilkan
            try {
                // Menunggu sesuai delay sebelum menampilkan lirik berikutnya
                Thread.sleep(delay[i]);
            } catch (InterruptedException e) {
                System.err.println("Thread interruped: " + e.getMessage());
            }
        }
    }
}
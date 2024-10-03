import components.queue.Queue;
import components.queue.Queue1L;

/**
 * Creating bare bones methods for my playlist component.
 */
public class ProofOfConcept {

    /**
     * finds the song to be removed and removes it.
     *
     * @param playlist
     * @param song
     */
    public static void removeSong(Queue<String> playlist, String song) {
        Queue<String> temp = playlist.newInstance();
        temp.transferFrom(playlist);

        while (temp.length() > 0) {
            String s = temp.dequeue();
            if (!s.equals(song)) {
                playlist.enqueue(s);
            }
        }

    }

    /**
     * adds a new song into the existing playlist.
     *
     * @param playlist
     *            the playlist containing the songs
     * @param song
     *            the song to be added into the playlist.
     */
    public static void addSong(Queue<String> playlist, String song) {
        playlist.enqueue(song);
    }

    /**
     * main.
     *
     * I know that in the actual creation of this component, it will not be like
     * this but I assume from the directions that this is what I am doing. Just
     * a quick demonstration of possible methods the component can do.
     *
     * @param args
     */
    public static void main(String args[]) {
        Queue<String> playlist = new Queue1L<String>();

        addSong(playlist, "Say");
        addSong(playlist, "Enemy");
        addSong(playlist, "JENNI");
        addSong(playlist, "Human");

        removeSong(playlist, "Enemy");
        /*
         * I hope I am understanding the directions correctly. I'm assuming when
         * we actually create out component it will be similar to that of the
         * projects we did where we implimented natural number on string and we
         * used to override methods. If not I can make adjustments to this again
         * if this was not the intended purpose of this assignment.
         */
    }
}

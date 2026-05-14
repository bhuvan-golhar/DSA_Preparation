// Problem: Implement Interface
// Concept: Interface
// Time Complexity: O(1)
// Space Complexity: O(1)

interface Playable {

    void play();
}

class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Playing music");
    }
}

public class Solution {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        player.play();
    }
}
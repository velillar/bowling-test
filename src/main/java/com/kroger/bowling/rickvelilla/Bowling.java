package com.kroger.bowling.rickvelilla;

public class Bowling {
    public static int calculateScore(String[] frames) {
        Bowling bowling = new Bowling();
        bowling.validateFrames(frames);

        // Placeholder for score calculation logic
        return 0;
    }

    private void validateFrames(String[] frames) {
        // Validate that frames has exactly 10 elements
        if (frames.length != 10) {
            throw new IllegalArgumentException("Frames array must contain exactly 10 elements.");
        }

        // Validate each frame
        for (int i = 0; i < frames.length; i++) {
            String[] values = frames[i].split(",");
            if (i < 9) {
                // First 9 frames must have exactly 2 values
                if (values.length != 2) {
                    throw new IllegalArgumentException("Frame " + (i + 1) + " must contain exactly 2 values.");
                }
            } else {
                // 10th frame must have 2 or 3 values
                if (values.length != 2 && values.length != 3) {
                    throw new IllegalArgumentException("Frame 10 must contain 2 or 3 values.");
                }
            }

            // Validate each value in the frame
            for (String value : values) {
                if (!isValidValue(value)) {
                    throw new IllegalArgumentException("Invalid value in frame " + (i + 1) + ": " + value);
                }
            }
        }
    }

    private boolean isValidValue(String value) {
        return value.matches("[0-9X/]");
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {

    public static void main(String[] args) {

        String filePath = "C:\\workspace\\java\\Jungle Trip - Quincas Moreira.wav";
        File file = new File(filePath);
        String secondSound = "C:\\workspace\\javaProject\\Glaze My Ego - The Soundlings.wav";
        File file2 = new File(secondSound);

        Scanner sc = new Scanner(System.in);
        System.out.println("Playlist includes: ");
        System.out.println("1. Jungle Trip");
        System.out.println("2. Glaze My Ego");

        System.out.println();

        System.out.println("Enter your choice: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    // clip.start();
                    String response = "";
                    while (!response.equals("Q")) {
                        System.out.println("P = Play");
                        System.out.println("S = Stop");
                        System.out.println("R = Reset");
                        System.out.println("Q = Quit");
                        System.out.println("Enter your choice: ");

                        response = sc.next().toUpperCase();
                        switch (response) {
                            case "P" ->
                                clip.start();
                            case "S" ->
                                clip.stop();
                            case "R" ->
                                clip.setMicrosecondPosition(0);
                            case "Q" ->
                                clip.close();
                            default ->
                                System.out.println("Invalid choice");
                        }
                    }
                    clip.start();
                    // System.out.println("no problem detected");
                } catch (FileNotFoundException e) {
                    System.out.println("File cannot be found");
                } catch (UnsupportedAudioFileException e) {
                    System.out.println("Audio file is not supported");
                } catch (LineUnavailableException e) {
                    System.out.println("Unable to access audio resources");
                } catch (IOException e) {
                    System.out.println("Something went wrong");
                } finally {
                    System.out.println("did you enjoyed?");

                }
                break;

            case "2":
                try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file2)) {

                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    // clip.start();
                    String response = "";
                    while (!response.equals("Q")) {
                        System.out.println("P = Play");
                        System.out.println("S = Stop");
                        System.out.println("R = Reset");
                        System.out.println("Q = Quit");
                        System.out.println("Enter your choice: ");

                        response = sc.next().toUpperCase();
                        switch (response) {
                            case "P" ->
                                clip.start();
                            case "S" ->
                                clip.stop();
                            case "R" ->
                                clip.setMicrosecondPosition(0);
                            case "Q" ->
                                clip.close();
                            default ->
                                System.out.println("Invalid choice");
                        }
                    }
                    clip.start();
                    // System.out.println("no problem detected");
                } catch (FileNotFoundException e) {
                    System.out.println("File cannot be found");
                } catch (UnsupportedAudioFileException e) {
                    System.out.println("Audio file is not supported");
                } catch (LineUnavailableException e) {
                    System.out.println("Unable to access audio resources");
                } catch (IOException e) {
                    System.out.println("Something went wrong");
                } finally {
                    System.out.println("did you enjoyed?");
                    System.out.println("Playlist includes: ");
                    System.out.println("1. Jungle Trip");
                    System.out.println("2. Glaze My Ego");

                }
                break;

            default:
                System.out.println("invalid choice");
        }

    }
}

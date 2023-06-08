package home_works.home_work_20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.time.LocalDateTime;

public class Listener {
    private static final String FORMAT = "windows-1251";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("Server is listening on port 8081");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connect to client");

            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(FORMAT)));
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream,Charset.forName(FORMAT)),true);

            printWriter.println("Привіт!");
            String message;

            if ((message = bufferedReader.readLine()) != null) {
                if (checkRussianLatter(message)) {
                    printWriter.println("Що таке паляниця?");
                    message = bufferedReader.readLine().toLowerCase();
                    if (message.equals("хліб")) {
                        printWriter.println(LocalDateTime.now());
                        printWriter.println("Щасти!");
                        clientSocket.close();
                    } else {
                       printWriter.println("Досвідос!");
                        clientSocket.close();
                    }
                } else {
                    printWriter.println(LocalDateTime.now());
                    printWriter.println("Щасти!");
                    clientSocket.close();
                }
            }
            System.out.println("Client disconnected, server was stop!");
        } catch (IOException ex) {
            System.out.println("Error when trying to listen!");
            ex.printStackTrace();
        }
    }

    private static boolean checkRussianLatter(String message) {
        String[] russianLetter = {"ъ", "ы", "э", "ё"};
        int countLetter = 0;
        for (String letter : russianLetter) {
            if (message.toLowerCase().contains(letter)) {
                countLetter++;
                break;
            }
        }
        return countLetter > 0;
    }
}

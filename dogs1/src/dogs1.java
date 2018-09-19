import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


import java.lang.Object;


public class dogs1{
    public static void download(String url, String fileName) throws Exception {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING);
        }
    }
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        try{
            System.out.println("Attempting to parse JSON file");
            Object obj = parser.parse(new FileReader("src/dog_urls.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray urlsArray = (JSONArray) jsonObject.get("urls");
            System.out.println("Parse successful\nDownloading images... Please wait");
            for(Object value : urlsArray){
                download(value.toString(),
                        "images/"+value.toString().substring(value.toString().lastIndexOf('/') + 1,
                                value.toString().length()));

            }
            System.out.println("Download successful");
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(IOException e) { e.printStackTrace(); }
        catch(ParseException e) { e.printStackTrace(); }
        catch(Exception e) { e.printStackTrace(); }

        System.out.println("Creating window...");
        String path = "images/";
        JFrame frame = new JFrame("Dogs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        DefaultListModel listModel = new DefaultListModel();
        int count = 0;
        for (int i = 0; i < listOfFiles.length; i++) {
            String name = listOfFiles[i].toString().substring(listOfFiles[i].toString().lastIndexOf('/') + 1,
                    listOfFiles[i].toString().length());
            if (name.endsWith("jpg")) {
                try{
                    ImageIcon ii = new ImageIcon(ImageIO.read(listOfFiles[i]));

                    listModel.add(count++, ii);
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
        JList lsm = new JList(listModel);
        lsm.setVisibleRowCount(1);
        frame.add(new JScrollPane(lsm));
        frame.pack();
        System.out.println("Finished!");
        frame.setVisible(true);

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                JList theList = (JList)mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 1) {
                    int index = theList.locationToIndex(mouseEvent.getPoint());
                    BufferedImage img = null;
                    if (index >= 0) {
                        JFrame frame = new JFrame("Dog zoomed");
                        try {
                            img = ImageIO.read(listOfFiles[index]);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ImageIcon imgIcon = new ImageIcon(img);
                        JLabel label = new JLabel();
                        label.setIcon(imgIcon);
                        frame.getContentPane().add(label, BorderLayout.CENTER);
                        frame.pack();
                        frame.setLocationRelativeTo(null); // centering frame
                        frame.setVisible(true);
                    }
                }
            }
        };
        lsm.addMouseListener(mouseListener);
    }
}


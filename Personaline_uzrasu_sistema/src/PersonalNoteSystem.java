/**
 @author POVILAS PETRAUSKAS
Personal Note System
2018 September
How program works -> read file READ_ME.txt
or program window bar "ABOUT PENOSYS"
 */

import org.joda.time.DateTime; // external library
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;


public class PersonalNoteSystem{
    public int buttonCanBePressed = 1;
    public final String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996",
            "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
            "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023",
            "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
    public final String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    public final String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30", "31"};
    JComboBox comboYears;
    JComboBox comboMonths;
    JComboBox comboDays;
    JComboBox finalComboYears;
    JComboBox finalComboMonths;
    JComboBox finalComboDays;
    String comboYearInput;
    String comboMonthInput;
    String comboDayInput;
    String finalComboYearInput;
    String finalComboMonthInput;
    String finalComboDayInput;
    PersonalNoteSystem(){
        comboYears = new JComboBox(years);
        comboMonths = new JComboBox(months);
        comboDays = new JComboBox(days);
        finalComboYears = new JComboBox(years);
        finalComboMonths = new JComboBox(months);
        finalComboDays = new JComboBox(days);
    }
    public void parseMonthInput(String comboInput){
        switch (comboInput){
            case "January":
                comboMonthInput = "01";
                break;
            case "February":
                comboMonthInput = "02";
                break;
            case "March":
                comboMonthInput = "03";
                break;
            case "April":
                comboMonthInput = "04";
                break;
            case "May":
                comboMonthInput = "05";
                break;
            case "June":
                comboMonthInput = "06";
                break;
            case "July":
                comboMonthInput = "07";
                break;
            case "August":
                comboMonthInput = "08";
                break;
            case "September":
                comboMonthInput = "09";
                break;
            case "October":
                comboMonthInput = "10";
                break;
            case "November":
                comboMonthInput = "11";
                break;
            case "December":
                comboMonthInput = "12";
                break;
            default:
                comboMonthInput = "01";
        }
    }
    public void parseFinalMonthInput(String comboInput){
        switch (comboInput){
            case "January":
                finalComboMonthInput = "01";
                break;
            case "February":
                finalComboMonthInput = "02";
                break;
            case "March":
                finalComboMonthInput = "03";
                break;
            case "April":
                finalComboMonthInput = "04";
                break;
            case "May":
                finalComboMonthInput = "05";
                break;
            case "June":
                finalComboMonthInput = "06";
                break;
            case "July":
                finalComboMonthInput = "07";
                break;
            case "August":
                finalComboMonthInput = "08";
                break;
            case "September":
                finalComboMonthInput = "09";
                break;
            case "October":
                finalComboMonthInput = "10";
                break;
            case "November":
                finalComboMonthInput = "11";
                break;
            case "December":
                finalComboMonthInput = "12";
                break;
            default:
                finalComboMonthInput = "01";
        }
    }
    public String parseSelectedDay(int selectedDay){
        String day = "";
        switch (selectedDay){
            case 1:
                day = "Mondays";
                break;
            case 2:
                day = "Tuesdays";
                break;
            case 3:
                day = "Wednesdays";
                break;
            case 4:
                day = "Thursdays";
                break;
            case 5:
                day = "Fridays";
                break;
            case 6:
                day = "Saturdays";
                break;
            case 7:
                day = "Sundays";
                break;
            default:
                day = "Unresolved day";
        }
        return day;
    }

        public static void main(String[] args) {
        /* ----- WINDOW ----- */
        // instantiate JComboBoxes
        PersonalNoteSystem pns = new PersonalNoteSystem();

        // create window
        JFrame window = new JFrame("PENOSYS"); // Personal Note System // Personaline uzrasu sistema
        window.setSize(600, 600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* --- MENU BAR --- */
        // create program menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("About");
        // add item in 'About' tab
        JMenuItem about = new JMenuItem(new AbstractAction("About PENOSYS") { // what happens when
                                                                                    // menu item is clicked?
            @Override
            public void actionPerformed(ActionEvent e) {
                // if menu selected, add new window
                // that explains what this program does

                // create separate window once 'About' tab is clicked
                JFrame menuWindow = new JFrame("About PENOSYS");
                menuWindow.setSize(200, 250);
                menuWindow.setResizable(false);
                // change window icon
                ImageIcon img = new ImageIcon("src/images/titleIcon.jpg");
                menuWindow.setIconImage(img.getImage());
                // create a panel and put text inside :
                JPanel menuPanel = new JPanel();
                menuPanel.setLayout(null);
                JTextPane menuText = new JTextPane();
                menuText.setBounds(10, 10, 180, 230);
                menuText.setText("This program takes two dates:\n" +
                        "* Date1\n" +
                        "* Date2\n" +
                        "then it takes [Date1's] day_of_week (ex. Friday)\n" +
                        "and calculates how many day_of_weeks ('Fridays')\n" +
                        " are between two given dates. Output: \n" +
                        "dates of day_of_week ('Fridays')");

                menuText.setEditable(false);
                menuPanel.add(menuText);
                menuWindow.add(menuPanel);
                menuWindow.setVisible(true);
            }
        });
        menu.add(about);
        menuBar.add(menu);
        window.setJMenuBar(menuBar);
        /* --- END OF MENU BAR --- */

        // change program icon
        ImageIcon img = new ImageIcon("src/images/titleIcon.jpg");
        window.setIconImage(img.getImage());

        // create panel to add items to window
        JPanel panel = new JPanel();
        // position items anywhere
        panel.setLayout(null);
        window.add(panel);

        /* ---------- TOP SECTION ---------- */
        // create text label
        JLabel label = new JLabel();
        label.setText("Select Current Date");
        label.setBounds(225, 20, 120, 20);
        panel.add(label);

        // add JComboBox event listeners
        pns.comboYears.addActionListener(e -> {
            // get data from user input
            JComboBox comboYears = (JComboBox) e.getSource();
            String selectedItem = (String)comboYears.getSelectedItem();
            pns.comboYearInput = selectedItem;
        });
        pns.comboMonths.addActionListener(e -> {
            JComboBox comboMonths = (JComboBox) e.getSource();
            String selectedItem = (String)comboMonths.getSelectedItem();
            // Replace month's name with numeric month (eg. January = 01)
            pns.parseMonthInput(selectedItem);
        });

        pns.comboDays.addActionListener(e -> {
            JComboBox comboDays = (JComboBox) e.getSource();
            String selectedItem = (String)comboDays.getSelectedItem();
            pns.comboDayInput = selectedItem;
        });
        pns.comboYears.setBounds(100, 50,120, 30);
        pns.comboMonths.setBounds(225, 50, 120, 30);
        pns.comboDays.setBounds(350, 50, 120, 30);
        // show value at given index
        pns.comboYears.setSelectedIndex(28);
        pns.comboYears.setBackground(Color.WHITE);
        pns.comboMonths.setSelectedIndex(9);
        pns.comboMonths.setBackground(Color.WHITE);
        pns.comboDays.setSelectedIndex(0);
        pns.comboDays.setBackground(Color.WHITE);
        panel.add(pns.comboYears);
        panel.add(pns.comboMonths);
        panel.add(pns.comboDays);

        /* ---------- MIDDLE SECTION ---------- */

        JLabel label2 = new JLabel();
        label2.setText("Select Final Date");
        label2.setBounds(235, 150, 120, 20);
        panel.add(label2);


        // add JComboBox event listeners
        pns.finalComboYears.addActionListener(e -> {
            // get data from user input
            JComboBox comboYears = (JComboBox) e.getSource();
            String selectedItem = (String)comboYears.getSelectedItem();
            pns.finalComboYearInput = selectedItem;
        });
        pns.finalComboMonths.addActionListener(e -> {
            JComboBox comboMonths = (JComboBox) e.getSource();
            String selectedItem = (String)comboMonths.getSelectedItem();
            // Replace month's name with numeric month (eg. January = 01)
            pns.parseFinalMonthInput(selectedItem);
        });
        pns.finalComboDays.addActionListener(e -> {
            JComboBox comboDays = (JComboBox) e.getSource();
            String selectedItem = (String)comboDays.getSelectedItem();
            pns.finalComboDayInput = selectedItem;
        });
        pns.finalComboYears.setBounds(100, 180, 120, 30);
        pns.finalComboMonths.setBounds(225, 180, 120, 30);
        pns.finalComboDays.setBounds(350, 180, 120, 30);
        pns.finalComboYears.setSelectedIndex(29);
        pns.finalComboYears.setBackground(Color.WHITE);
        pns.finalComboMonths.setSelectedIndex(5);
        pns.finalComboMonths.setBackground(Color.WHITE);
        pns.finalComboDays.setSelectedIndex(5);
        pns.finalComboDays.setBackground(Color.WHITE);
        panel.add(pns.finalComboYears);
        panel.add(pns.finalComboMonths);
        panel.add(pns.finalComboDays);

        /* ---------- BOTTOM SECTION ---------- */
        // create output area
        JTextArea outputField = new JTextArea();
        outputField.setBounds(15, 340, 550, 180);
        Border border = BorderFactory.createLineBorder(Color.CYAN, 2);
        outputField.setBorder(border);
        outputField.setEditable(false);
        // add scroll bar
        JScrollPane scrollPane = new JScrollPane();
        // always show scroll bar
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(15, 340, 560, 180);
        scrollPane.getViewport().setBackground(Color.WHITE);
        scrollPane.getViewport().add(outputField);
        // add TextArea to window
        panel.add(scrollPane);
        // Create button that performs date calculation
        JButton button = new JButton("Calculate");
        button.setBounds(237,  250, 90, 30);
        // once the button is pressed
        button.addMouseListener(new MouseListener() {
                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        // get dates from ComboBox1 and ComboBox2
                                        String date1 = pns.comboYearInput + "-" + pns.comboMonthInput + "-" + pns.comboDayInput;
                                        String date2 = pns.finalComboYearInput + "-" + pns.finalComboMonthInput + "-" + pns.finalComboDayInput;
                                        // generate strings for date comparison
                                        String date1INTEGER = pns.comboYearInput + pns.comboMonthInput +  pns.comboDayInput;
                                        String date2INTEGER = pns.finalComboYearInput + pns.finalComboMonthInput + pns.finalComboDayInput;
                                        // check for valid input
                                        if(Integer.parseInt(date1INTEGER) >= Integer.parseInt(date2INTEGER)){
                                            // if wrong input, don't calculate result
                                            pns.buttonCanBePressed = 0;
                                            pns.finalComboYears.setBackground(Color.RED);
                                            pns.finalComboMonths.setBackground(Color.RED);
                                            pns.finalComboDays.setBackground(Color.RED);
                                        }
                                        outputField.setText("");
                                        outputField.setBorder(null);
                                        if(pns.buttonCanBePressed == 1){
                                            pns.finalComboYears.setBackground(Color.WHITE);
                                            pns.finalComboMonths.setBackground(Color.WHITE);
                                            pns.finalComboDays.setBackground(Color.WHITE);
                                            // parse both dates
                                            Calculator calculator = new Calculator(date1, date2);
                                            // add dates into ArrayList
                                            List<DateTime> day = new ArrayList<>();
                                            // variable to store output that will be displayed in TextArea
                                            String output = "";
                                            // amount of dates variable
                                            int records = 0;
                                            day = calculator.GetDates();
                                            for(DateTime days : day){
                                                // add dates and cut the unnecessary information (Leave only the date, which is 10 letters long)
                                                output += days.toString().substring(0, 10) + "    ";
                                                records++;
                                            }
                                            // get day_of_week
                                            int selectedDay = calculator.GetDayOfWeek(date1);
                                            // set it to alphabetical day (eg. Monday)
                                            String dayName = pns.parseSelectedDay(selectedDay);
                                            // set TextArea borders and add text to border
                                            outputField.setBorder(BorderFactory.createTitledBorder(dayName));
                                            outputField.setColumns(records);
                                            // wrap and set text in TextArea
                                            outputField.setLineWrap(true);
                                            outputField.setWrapStyleWord(true);
                                            outputField.setText(output);
                                        }
                                        pns.buttonCanBePressed = 1;

                                    }
                                    // not overwriting further methods
                                    @Override
                                    public void mousePressed(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {

                                    }
                                });
        panel.add(button);
        panel.setBackground(Color.WHITE);
        window.setVisible(true);

        /* ----- END OF WINDOW ----- */
    }

}

// TODO Do not let user input wrong dates, eg. February 29, 30, 31 or April 31, etc...
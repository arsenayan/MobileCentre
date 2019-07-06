package com.company;

import com.sun.jdi.Value;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdminOfMobileCentre extends JFrame {
    private static int profit;
    private List<Phone> phone = new ArrayList<>();


    /**
     * Panels
     */
    private JPanel panelOfAdd = new JPanel();//Panel of sdd (texts and buttons)
    private JPanel panelOfSale = new JPanel();//Panel of sale (texts and buttons)
    private JPanel panelOfinfo = new JPanel();//Panel of info (texts and buttons)

    /**
     * Buttons
     */
    private JButton buttonInfoPhones = new JButton("Show result"); //This Button shows how many phones we have in base
    private JButton buttonByModel = new JButton("by Model");//This Button shows sorting phones by Model
    private JButton buttonbyYear = new JButton("by Year");//This Button shows sorting phones by Year
    private JButton buttonbyprise = new JButton("by Price");//This Button shows sorting phones by Price
    private JButton buttonbyRam = new JButton("by Ram");//This Button shows sorting phones by Ram
    private JButton buttonBenefit = new JButton("Benefit");//This Button shows benefit of sale
    private JButton buttonAddPhone = new JButton("Add");//This Button will add new phones
    private JButton buttonSalePhone = new JButton("Sale");//This Button will sale the phone

    /**
     * Text Fields
     */
    private JTextField textInputModel = new JTextField("");// add new model`s name in base
    private JTextField textInputYear = new JTextField("");// add new model`s  year in base
    private JTextField textInputPrice = new JTextField("");// add new model`s  price in base
    private JTextField textInputRam = new JTextField("");// add new model`s  Ram in base
    private JTextField textInputIndex = new JTextField("");// add new model`s index Which will be sold


    /**
     * Labels
     */
    private JLabel labelAddPhone = new JLabel("Add new phone in base");
    private JLabel labelAddPhonebyModel = new JLabel("Input Model");
    private JLabel labelAddPhonbyYear = new JLabel("Input Year");
    private JLabel labelAddPhonebyPrice = new JLabel("Input Price");
    private JLabel labelAddPhonebyRam = new JLabel("Input Ram");
    private JLabel labelSalePhone = new JLabel("Sale phone write mobile name");
    private JLabel labelSortInfo = new JLabel("Information About Base");
    private JLabel labelBenefitInfo = new JLabel("Information About Benefit");


    public AdminOfMobileCentre() throws IOException {
        setTitle("Mobile Centre OF Germany");

        //Layouts
        setLayout(null);
        panelOfAdd.setLayout(null);
        panelOfSale.setLayout(null);
        panelOfinfo.setLayout(null);

        //Locations
        panelOfAdd.setBounds(0, 10, 210, 400);
        panelOfSale.setBounds(0, 410, 210, 190);
        panelOfinfo.setBounds(210, 10, 390, 590);


        //Colors
        panelOfinfo.setBackground(Color.GRAY);
        panelOfSale.setBackground(Color.LIGHT_GRAY);
        panelOfAdd.setBackground(Color.lightGray);

        //Adds
        add(panelOfAdd);
        add(panelOfSale);
        add(panelOfinfo);

        //The Adds of panelOfAdd
        panelOfAdd.add(labelAddPhone);
        panelOfAdd.add(labelAddPhonebyModel);
        panelOfAdd.add(labelAddPhonebyPrice);
        panelOfAdd.add(labelAddPhonebyRam);
        panelOfAdd.add(labelAddPhonbyYear);
        panelOfAdd.add(textInputModel);
        panelOfAdd.add(textInputPrice);
        panelOfAdd.add(textInputRam);
        panelOfAdd.add(textInputYear);
        panelOfAdd.add(buttonAddPhone);

        labelAddPhone.setBounds(30, 10, 200, 10);
        labelAddPhonebyModel.setBounds(50, 40, 100, 20);
        labelAddPhonebyPrice.setBounds(50, 100, 100, 20);
        labelAddPhonebyRam.setBounds(50, 160, 100, 20);
        labelAddPhonbyYear.setBounds(50, 220, 100, 20);
        textInputModel.setBounds(50, 65, 100, 20);
        textInputPrice.setBounds(50, 125, 100, 20);
        textInputRam.setBounds(50, 185, 100, 20);
        textInputYear.setBounds(50, 245, 100, 20);

        buttonAddPhone.setBounds(50, 310, 100, 30);

        //The Adds of panelOfSale
        panelOfSale.add(labelSalePhone);
        panelOfSale.add(textInputIndex);
        panelOfSale.add(buttonSalePhone);

        labelSalePhone.setBounds(10, 20, 200, 20);
        textInputIndex.setBounds(10, 70, 50, 20);

        buttonSalePhone.setBounds(70, 70, 120, 20);

        //The Adds of panelOfinfo
        panelOfinfo.add(buttonInfoPhones);
        panelOfinfo.add(buttonByModel);
        panelOfinfo.add(buttonbyprise);
        panelOfinfo.add(buttonbyRam);
        panelOfinfo.add(buttonbyYear);
        panelOfinfo.add(buttonBenefit);
        panelOfinfo.add(labelSortInfo);
        panelOfinfo.add(labelBenefitInfo);


        buttonInfoPhones.setBounds(100, 10, 200, 20);
        buttonByModel.setBounds(0, 65, 90, 20);
        buttonbyprise.setBounds(0, 125, 90, 20);
        buttonbyRam.setBounds(0, 185, 90, 20);
        buttonbyYear.setBounds(0, 245, 90, 20);
        buttonBenefit.setBounds(100, 400, 200, 20);

        labelSortInfo.setBounds(100, 5, 300, 400);
        labelBenefitInfo.setBounds(100, 340, 300, 50);


        buttonAddPhone.addActionListener(e -> {
            Phone phoneAction = new Phone(Model.valueOf(textInputModel.getText()), Integer.parseInt(textInputYear.getText()), Integer.parseInt(textInputPrice.getText()), Integer.parseInt(textInputRam.getText()));
            this.phone.add(phoneAction);
            System.out.println(this.phone.get(0).toString());
        });
        buttonInfoPhones.addActionListener(e->{
            String value ="<html>";
            for (Phone p:this.phone) {
               value+=""+p.toString()+"<br>";
            }
            value+="</html>";
            labelSortInfo.setText(value);


        });
        buttonSalePhone.addActionListener(e -> {

            String value = textInputIndex.getText();
            for (int i=0;i<phone.size();i++){
                if (value.equals(phone.get(i).getModel().getName())){
                    incrementProfit(phone.get(i).getPhonePrice());
                    phone.remove(phone.get(i));
                }
            }
             value ="<html>";
            for (Phone p:this.phone) {
                value+=""+p.toString()+"<br>";
            }
            value+="</html>";
            labelSortInfo.setText(value);



                });
        buttonBenefit.addActionListener(e->{
            JOptionPane.showMessageDialog(null,profit);
            String value ="<html>";
            for (Phone p:this.phone) {
                value+=""+p.toString()+"<br>";
            }
            value+="</html>";
            labelSortInfo.setText(value);
        });
        buttonbyprise.addActionListener(e->{
            Collections.sort(phone,new SortByPrice());
        });
        buttonbyRam.addActionListener(e->{
            Collections.sort(phone,new SortByRam());
        });
        buttonbyYear.addActionListener(e->{
            Collections.sort(phone,new SortByYear());
        });

        setResizable(true);
        setSize(600, 600);
        setLocation(getWidth() / 2, getHeight() / 2);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int getProfit() {
        return profit;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void addPhone(Phone phon) {
        phone.add(phon);
    }

    private void incrementProfit(int phonePrice) {
        profit += phonePrice;
    }
    public void printPhoneInfo(){
        int index = 0;
        for (Phone phon : phone) {
            System.out.println(index + " " + phon.toString());
            index ++;
        }
        System.out.println("current profit = " + profit);
    }






}

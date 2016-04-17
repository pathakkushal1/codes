/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Kushal
 */
class Pseudo {

    public static String returnName(String name) {
        Random ra = new Random();
        int a = ra.nextInt(15);
        while (a < 6) {
            a = ra.nextInt(15);
        }
        name = name + " " + a;
        return name;
    }

}

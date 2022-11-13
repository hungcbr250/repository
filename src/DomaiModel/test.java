/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomaiModel;

/**
 *
 * @author HP probook
 */
public class test {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 19) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}

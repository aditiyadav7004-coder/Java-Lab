/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
class JoinExample extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        t1.join(); // wait for t1

        t2.start();
    }
}

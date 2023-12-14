package chapter6.lambda.anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;

/**
 * В этой программе демонстрируется применение
 * анонимных внутренних классов
 * @version 1.12 2023-12-15
 * @author Cay Horstmann
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args) {

        var clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * Часы, выводящие время через регулярные промежутки
 */
class TalkingClock {

    /**
     * Запускает часы
     * @param interval Интервал между сообщениями (в миллисекундах)
     * @param beep Истинно, если часы должны издовать звуковой сигнал
     */
    public void start(int interval, boolean beep) {
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
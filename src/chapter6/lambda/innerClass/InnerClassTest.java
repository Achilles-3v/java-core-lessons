package chapter6.lambda.innerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;

/**
 * В этой программе демонстрируется
 * применение внутренних классов
 * @version 1.11 2023-12-14
 * @author Cay Horstmann
 */
public class InnerClassTest {

    public static void main(String[] args) {


    }
}

/**
 * Часы, выводящие время через регулярные промежутки
 */
class TalkingClock {

    private int interval;
    private boolean beep;

    /**
     * Конструктор "Говорящие часы"
     * @param interval Интервал между сообщениями (милисекунды)
     * @param beep Истинно, если часы должны издавать звуковой сигнал
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Запускает часы
     */
    public void start() {
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}

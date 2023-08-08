package homework07;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Task2 {
    /*
    Реализовать с использованием switch
    Ваш ребенок принес оценку за контрольную работу по математике.
    В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
    Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
    На сегодня у него осталось 45 минут. (записать в переменную)

    Если оценка:
    от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
    от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
    от 4 до 6 -> Нейтральные слова + ко времени 15 минут
    3 -> Огорчитесь. Минус 30 минут ко времени
    оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено

    Выведите на экран оставшееся на сегодня время для просмотра ТВ
     */
    public static void main(String[] args) {

        Random random = new Random();
        int note = random.nextInt(13);
        System.out.println("Оценка по Математике: " + note);
        int tvTime = 45;

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("Ты просто супер! Я тобой горжусь!");
                tvTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Хорошо сделано!");
                tvTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Ну пойдет.");
                tvTime += 15;
                break;
            case 3:
                System.out.println("Так не пойдет!");
                tvTime -= 30;
                break;
            case 2:
            case 1:
                System.out.println("Очень плохо!");
                tvTime = 0;
                break;
            default:
                System.out.println("Ошибка: Что-то пошло не так");
        }
        System.out.println("На сегодня осталось " + tvTime + " минут.");
    }
}

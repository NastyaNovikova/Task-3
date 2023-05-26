package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//Процесс внедрения зависимостей при использовании @Autowired
//такой:
// 1. Сканирование пакета, поиск классов с аннотацией @Component
//2. При наличии аннотации @Autowired начинается поиск подходящего по типу бина
@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog") //Если при использовании @Autowired подходящих по типу бинов больше одного, то выбрасывается исключение.
    // Предотвратить выброс данного исключения можно конкретно указав, какой бин должен быть внедрён. Для этого и используют аннотацию @Qualifier.

    private Animal animal;
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}

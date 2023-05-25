package app.model;

import org.springframework.stereotype.Component;
//Если к аннотации @Component не прописать bean id, то
//бину будет назначен дефолтный id.
//Дефолтный bean id получается из имени класса,
//заменяя его первую заглавную букву на прописную.
//идет сканирование классов и поиск аннотации @Component

@Component //Дефолтный bean id получается из имени класса, заменяя его первую заглавную букву на прописную.
public class Dog extends Animal{
    @Override
    public String toString() {
        return "I'm a Dog";
    }
}

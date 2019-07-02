package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.сonverter.Converter;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public  void whenStart0AndFinish10Then30(){
        Counter counter = new Counter();
        int result = counter.add(0,10);
        assertThat(result,is(30));
    }
}

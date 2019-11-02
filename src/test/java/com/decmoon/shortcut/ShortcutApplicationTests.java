package com.decmoon.shortcut;

import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.collection.CollectionExhibitor;
import com.decmoon.shortcut.collection.list.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortcutApplicationTests {

    @Test
    public void contextLoads() {
        ArrayList<Object> objects = Lists.newArrayList();
        objects.add(1);
        objects.add(new Object());
        CollectionExhibitor.see(objects);
    }

}

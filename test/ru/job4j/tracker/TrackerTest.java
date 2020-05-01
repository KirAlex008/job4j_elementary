package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenFindAllItemThenTrackerHasnotNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item(null);
        Item item3 = new Item("test3");
        Item item4 = new Item("test4");
        Item item5 = new Item(null);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        //tracker.findAll();
        Item[] test = new Item[3];
        test = tracker.findAll();
        Item[] forTest = new Item[3];
        forTest[0] = item1;
        forTest[1] = item3;
        forTest[2] = item4;
        assertThat(test, is(forTest));
    }

    @Test
    public void whenfindByNameItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item(null);
        Item item3 = new Item("test3");
        Item item4 = new Item("test4");
        Item item5 = new Item("test4");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] test = new Item[2];
        test = tracker.findByName("test4");
        Item[] forTest = new Item[2];
        forTest[0] = item4;
        forTest[1] = item5;
        assertThat(test, is(forTest));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    Random newRandom = new Random();

    @Test
    void addTest() {
        DoubleLinkedList dList = new DoubleLinkedList();
        dList.add(7);
    }

    @Test
    void getTest() {
        int magicNumber = newRandom.nextInt();
        DoubleLinkedList dList = new DoubleLinkedList();
        dList.add(magicNumber);
        dList.add(5);
        assertEquals(magicNumber, dList.get(0));
        assertEquals(5, dList.get(1));
    }

    @Test
    void removeTest() {
        int magicNumber;
        DoubleLinkedList dList = new DoubleLinkedList();
        int[] controlList = new int[5];
        for (int i = 0; i < 5; i++) {
            magicNumber = newRandom.nextInt(100);
            dList.add(magicNumber);
            controlList[i] = magicNumber;
        }
        dList.remove(4);
        dList.remove(2);
        dList.remove(0);
        assertEquals(controlList[1], dList.get(0));
        assertEquals(controlList[3], dList.get(1));
    }

}
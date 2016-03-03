package homeWork1;

/**
 * Created by Александр on 03.03.2016.
 */
public class ImprovedArray {

    String[] array = new String[10];
    int elementsCounter = 0;

    public void add(String value) { //добавляет эелементы друг за другом
        if (elementsCounter == array.length) {
            makeLargerArray();
        }

        array[elementsCounter] = value;
        elementsCounter++;
    }

    public void makeLargerArray() {
        String[] array = new String[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
    }

    public String get(int index) { //возвращает элемент, находящийся по указанному индексу

        return array[index];
    }

    public int size() { // количество заполненных элементов (которые передали в метод add(String)) (не размер массива!)

        return elementsCounter;
    }

    public boolean equals(ImprovedArray other) {
        if (elementsCounter != other.elementsCounter) {
            return false;
        } else {
            for (int i = 0; i < elementsCounter; i++) {
                if (!array[i].equals(other.array[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() { // возвращает красиво оформленную строку (без null)

        String goodString = "Our good string: ";
        for (int i = 0; i < elementsCounter; i++) {
            goodString = goodString + array[i] + " ";
        }
        return goodString;
    }
}

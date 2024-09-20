package PC;

import PC.HardDisk.HardDisk;
import PC.HardDisk.HardType;
import PC.Keyboard.Keyboard;
import PC.Keyboard.Ligths;
import PC.Keyboard.TypeKey;
import PC.Memory.Memory;
import PC.Memory.TypeMemory;
import PC.display.Display;
import PC.display.TypeDisplay;
import PC.processor.Creator;
import PC.processor.Proccessor;

public class mainn {
    public static void main(String[] args) {

        Proccessor proccessor = new Proccessor(Creator.INTEL, 3, 500, 44);
        Display display = new Display(24, 500, TypeDisplay.IPS);
        Keyboard keyboard = new Keyboard(TypeKey.NOPROVOD, Ligths.ON, 500);
        Memory memory = new Memory(TypeMemory.DDR4, 1024, 500);
        HardDisk hardDisk = new HardDisk(500, HardType.SSD, 512);
        Computer computer = new Computer(hardDisk, display, keyboard, proccessor, memory);
        System.out.println(computer.getWaigth());
    }


}

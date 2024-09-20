package PC;

import PC.HardDisk.HardDisk;
import PC.HardDisk.HardDisk;
import PC.Keyboard.Keyboard;
import PC.Memory.Memory;
import PC.display.Display;
import PC.processor.Proccessor;

public class Computer {
private Display display;
private HardDisk hardDisk;
private Keyboard keyboard;
private Proccessor proccessor;
private Memory memory;

    public Computer(HardDisk hardDisk,
                    Display display,
                    Keyboard keyboard,
                    Proccessor proccessor,
                    Memory memory)
    {
        this.hardDisk = hardDisk;
        this.display = display;
        this.keyboard = keyboard;
        this.proccessor = proccessor;
        this.memory = memory;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Proccessor getProccessor() {
        return proccessor;
    }

    public void setProccessor(Proccessor proccessor) {
        this.proccessor = proccessor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public  double getWaigth(){
        return display.getWeigth()+hardDisk.getWeigth()+
        keyboard.getWeigth()+memory.getWeigth()+proccessor.getWeigth();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display=" + display +
                ", hardDisk=" + hardDisk +
                ", keyboard=" + keyboard +
                ", proccessor=" + proccessor +
                ", memory=" + memory +
                '}';
    }
}



package com.company;

public class RegularTicket extends Ticket {
    boolean isFoodAvaild;
    boolean isWaterAvaild;
    boolean isSnacksAvaild;

    public boolean isFoodAvaild() {
        return isFoodAvaild;
    }

    public void setFoodAvaild(boolean foodAvaild) {
        isFoodAvaild = foodAvaild;
    }

    public boolean isWaterAvaild() {
        return isWaterAvaild;
    }

    public void setWaterAvaild(boolean waterAvaild) {
        isWaterAvaild = waterAvaild;
    }

    public boolean isSnacksAvaild() {
        return isSnacksAvaild;
    }

    public void setSnacksAvaild(boolean snacksAvaild) {
        isSnacksAvaild = snacksAvaild;
    }

                RegularTicket() {
        this.isFoodAvaild = isFoodAvaild;
        this.isWaterAvaild = isWaterAvaild;
        this.isSnacksAvaild = isSnacksAvaild;
    }
}

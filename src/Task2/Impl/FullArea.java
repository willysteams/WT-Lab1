package Task2.Impl;

import Task2.Interface.Area;

public class FullArea implements Area {
    private final Area[] areas;

    public FullArea(Area... areas) {
        this.areas = areas;
    }

    @Override
    public boolean Contains(double x, double y) {
        for (Area area : areas) {
            if (area.Contains(x, y)) return true;
        }

        return false;
    }
}

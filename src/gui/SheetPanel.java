package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

public class SheetPanel extends BorderPanel {
	private SlotLabels slotLabels;
	
    public SheetPanel(int rows, int columns, CurrentAddress curr) {
        slotLabels = new SlotLabels(rows, columns, curr);
    	add(WEST, new RowLabels(rows));
        add(CENTER, slotLabels);
    }
    
    public SlotLabels getSlotLabels() {
    	return slotLabels;
    }
}
package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingConstants;

import model.Sheet;

public class SlotLabels extends GridPanel implements Observer{
    private List<SlotLabel> labelList;

    public SlotLabels(int rows, int cols, CurrentAddress curr) {
        super(rows + 1, cols);
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                SlotLabel label = new SlotLabel(ch, row, curr);
                add(label);
                labelList.add(label);
            }
        }
    }
    
    public void update(Observable obs, Object obj) {
    	Sheet sheet = (Sheet) obs;
    	for(SlotLabel s: labelList){
    		s.setText(sheet.getSlotText(s.toString()));
    	}
    	
    }
    
    public void clickFirstLabel(){
        SlotLabel firstLabel = labelList.get(0);
        firstLabel.mouseClicked(null);
    }
}

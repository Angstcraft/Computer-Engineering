package seatingChairJFrame;

public static void SeatingChairJFrameMain(String[] args) 
{
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                ChairSimulator simulator = new ChairSimulator();
                simulator.setVisible(true);
            }
        });
    }
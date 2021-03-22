import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel {




    public void paintComponent(Graphics g){


        List<XmasShape> shapes = new ArrayList<>();
        int[] x={-100,100,0};
        int[] y={100,100,0};
        int x_sr=500;
        setBackground(new Color(0,0,50));

        shapes.add(new Background(1000, 700));
        //wszystkie galezie
        shapes.add(new Branch( x ,y, 2, x_sr, 400));
        shapes.add(new Branch( x ,y, 1.6, x_sr, 350));
        shapes.add(new Branch( x ,y, 1.2, x_sr, 300));
        shapes.add(new Branch( x ,y, 0.8, x_sr, 270));
        shapes.add(new Branch( x ,y, 0.5, x_sr, 240));

        //bombki
        shapes.add(new Bubble(550,480,0.2 ));
        shapes.add(new Bubble(520,420,0.2 ));
        shapes.add(new Bubble(460,320,0.2 ));
        shapes.add(new Bubble(390,320,0.2 ));
        shapes.add(new Bubble(390,480,0.2 ));
        shapes.add(new Bubble(430,300,0.2 ));
        shapes.add(new Bubble(440,470,0.2 ));
        shapes.add(new Bubble(360,440,0.2 ));
        shapes.add(new Bubble(370,310,0.2 ));
        shapes.add(new Bubble(400,270,0.2 ));
        shapes.add(new Bubble(450,420,0.2 ));
        shapes.add(new Bubble(360,360,0.2 ));

        //gwiazda na wierzchołku
        shapes.add(new Star(500,230,0.5,0,Color.yellow));
        //gwiazdki
        shapes.add(new Star(50,100,0.1,0.1,Color.white));
        shapes.add(new Star(100,320,0.1,0.2,Color.white));
        shapes.add(new Star(200,45,0.1,0.3,Color.white));
        shapes.add(new Star(350,140,0.1,0.4,Color.white));
        shapes.add(new Star(520,100,0.1,0.5,Color.white));
        shapes.add(new Star(650,170,0.1,0.6,Color.white));
        shapes.add(new Star(800,100,0.1,0.7,Color.white));
        shapes.add(new Star(850,280,0.1,0.8,Color.white));
        shapes.add(new Star(950,200,0.1,0.9,Color.white));
        shapes.add(new Star(550,190,0.1,0.9,Color.white));
        shapes.add(new Star(850,150,0.1,0.9,Color.white));
        shapes.add(new Star(250,220,0.1,0.9,Color.white));
        shapes.add(new Star(350,720,0.1,0.1,Color.white));
        shapes.add(new Star(450,420,0.1,0.2,Color.white));
        shapes.add(new Star(550,820,0.1,0.3,Color.white));
        shapes.add(new Star(650,420,0.1,0.4,Color.white));
        shapes.add(new Star(750,520,0.1,0.5,Color.white));
        shapes.add(new Star(850,620,0.1,0.6,Color.white));
        shapes.add(new Star(950,120,0.1,0.7,Color.white));
        shapes.add(new Star(250,520,0.1,0.8,Color.white));
        shapes.add(new Star(150,520,0.1,0.8,Color.white));
        shapes.add(new Star(240,200,0.1,0.8,Color.white));
        shapes.add(new Star(320,310,0.1,0.8,Color.white));
        shapes.add(new Star(280,540,0.1,0.8,Color.white));
        shapes.add(new Star(220,650,0.1,0.8,Color.white));
        shapes.add(new Star(310,550,0.1,0.8,Color.white));
        shapes.add(new Star(200,320,0.1,0.8,Color.white));
        shapes.add(new Star(180,420,0.1,0.8,Color.white));
        shapes.add(new Star(850,340,0.1,0.8,Color.white));
        shapes.add(new Star(800,520,0.1,0.8,Color.white));
        shapes.add(new Star(750,480,0.1,0.8,Color.white));
        shapes.add(new Star(820,680,0.1,0.8,Color.white));
        shapes.add(new Star(880,380,0.1,0.8,Color.white));
        shapes.add(new Star(900,480,0.1,0.8,Color.white));
        shapes.add(new Star(780,180,0.1,0.8,Color.white));


        super.paintComponent(g);

        for (XmasShape xs : shapes) {
            xs.draw((Graphics2D)g);
        }

        g.setColor(new Color(139,69,19));
        g.fillRect(480,600,40,60);
        g.setFont(new Font("Manjari", Font.BOLD, 38));
        g.setColor(Color.white);
        g.drawString("Wesołych świąt!", 330, 50);


        System.out.println("painting...");

    }
}

    Random rand = new Random();
    
    Building b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    
    b1 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
    b2 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+50);
    b3 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+100);
    b4 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+150);
    b5 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+200);
    b6 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+250);
    b7 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+300);
    b8 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+350);
    b9 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+400);
    b10 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+450);
    b11 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+500);
    b12 = new Building(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50)+550);
    setBackground (Color.white);
    setSize (400, 400);
    b1.draw(page, Color.black, 70, 30);
    b2.draw(page, Color.blue, 70, 60);
    b3.draw(page, Color.cyan, 70, 90);
    b4.draw(page, Color.darkGray, 70, 120);
    b5.draw(page, Color.gray, 70, 150);
    b6.draw(page, Color.green, 70, 180);
    b7.draw(page, Color.lightGray, 70, 210);
    b8.draw(page, Color.magenta, 70, 240);
    b9.draw(page, Color.orange, 70, 270);
    b10.draw(page, Color.pink, 70, 300);
    b11.draw(page, Color.red, 70, 330);
    b12.draw(page, Color.yellow, 70, 360);
    
    page.setColor (Color.yellow);
    page.fillRect (15, 150, 375, 90);
    page.setColor (Color.black);
    page.drawString ("Crayola Building Box (12-Pack!)", 117, 200);
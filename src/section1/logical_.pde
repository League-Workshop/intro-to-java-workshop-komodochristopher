int x=0;
void setup(){
  
  size(700,700);
}
void draw() {
  
  ellipse(400,500,400,500);

if (mousePressed) {
  fill(0,0,255);
  x++;
}
else
{
fill(0,255,0);
x++;
}
ellipse(x,300,400,100);

}
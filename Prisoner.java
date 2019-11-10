public class Prisoner {
    //Campos 
    public String name;
    public double height;
    public int sentence;
    //Constructor
    public void Prisoner(){
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentence);
    }
    public void Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.sentence);
    }
    public void Prisoner(String name, double height, int sentence, boolean t){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
	if (t == true){
            System.out.println(this.name);
            System.out.println(this.height);
            System.out.println(this.sentence);
	    this.think();
	}
    }
    //Metodos
    public void think(){
        System.out.println("I'll have my revenge.");
    }
}
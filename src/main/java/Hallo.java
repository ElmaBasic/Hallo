public class Hallo
{
    private char gender;
    private char tag;
    private int age;
    private double height;

    public Hallo(char gender, char tag, int age, double height)
    {
        this.gender = gender;
        this.tag = tag;
        this.age = age;
        this.height = height;
    }

    public char getGender()
    {
        return gender;
    }

    public char getTag()
    {
        return tag;
    }

    public int getAge()
    {
        return age;
    }

    public double getHeight()
    {
        return height;
    }

    public String auswertungTag(){
        if (tag == 'x'){
            return "gar nicht cool";
        }
        else if (tag == 'y'){
            return "halb so cool";
        }
        else if (tag == 'z'){
            return "sehr cool";
        }
        return "Fehler";
    }
}


package area;

public class Area {
    private int l,w;
    public int a;
    
    //practice of method implement
    //lab report 1
    /*public void setTinfo(int l, int w)
    {
        this.l=l;
        this.w=w;
        a = l * w;
    }*/
    /*public int display()
    {
        return a;
    }*/

    /*public void setInfo(int i, int j)
    {
        l=i;
        w=j;
        a = l*w;
    }*/

    Area(int i,int j)
    {
        l=i;
        w=j;
        a = l*w;
    }

    public int Display()
    {
        return a;
    }
}

public class ComplexNo {
    int real;
    int comp;
    public static void showinfo(ComplexNo a){
        System.out.print(a.real);
        System.out.println(" + i"+a.comp);

    }
    public int[] getinfo(ComplexNo b){
        int[] p = {b.real,b.comp};
        return p;
    }
    public static ComplexNo add(ComplexNo m, ComplexNo n){
        int nr,nc;
        nr = m.real+n.real;
        nc = m.comp+n.comp;
        ComplexNo c = new ComplexNo(nr, nc);
        System.out.println("Addition complete");
        return c;
    }

    public ComplexNo(int i, int j){
        real = i;
        comp = j;
    }
    
}

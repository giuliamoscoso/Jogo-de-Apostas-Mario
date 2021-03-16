package jogoraul;

public class Lutador {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNv() {
        return nv;
    }

    public void setNv(int nv) {
        this.nv = nv;
    }

    public int getNd() {
        return nd;
    }

    public void setNd(int nd) {
        this.nd = nd;
    }

    public int getNe() {
        return ne;
    }

    public void setNe(int ne) {
        this.ne = ne;
    }

    public double getFt() {
        return ft;
    }

    public void setFt(double ft) {
        this.ft = ft;
    }

    public Lutador(String nome,int id, int nv, int nd, int ne, double ft) {
        this.nome = nome;
        this.id = id;
        this.nv = nv;
        this.nd = nd;
        this.ne = ne;
        this.ft = ft;
    }
    
    private String nome;
    private int id;
    private int nv;
    private int nd;
    private int ne;
    private double ft;
}
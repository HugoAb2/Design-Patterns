package Prototype.FirstCoding;

public abstract class Produto implements Cloneable{
    private int paginas;
    private int codigo;
    private float preco;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "paginas=" + paginas +
                ", codigo=" + codigo +
                ", preco=" + preco +
                '}';
    }
}
